package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domain.Questionnaire;
import com.example.demo2.form.Ex17QuestionnaireForm;

@Controller
@RequestMapping("/ex17")
public class Ex17QuestionnaireController {

    @ModelAttribute
    public Ex17QuestionnaireForm setUpForm() {
        return new Ex17QuestionnaireForm();
    }

    @RequestMapping("")
    public String index(Model model) {

        Map<Integer, String> hobbyMap = new LinkedHashMap<>();
        hobbyMap.put(1, "野球");
        hobbyMap.put(2, "サッカー");
        hobbyMap.put(3, "テニス");

        model.addAttribute("hobbyMap", hobbyMap);

        Map<Integer, String> languageMap = new LinkedHashMap<>();
        languageMap.put(1, "java");
        languageMap.put(2, "Python");
        languageMap.put(3, "Ruby");

        model.addAttribute("languageMap", languageMap);

        return "ex-17-input";
    }

    @RequestMapping("/process")
    public String process(
            @Validated Ex17QuestionnaireForm form,
            BindingResult result,
            RedirectAttributes redirectAttributes,
            Model model) {
        
                if(result.hasErrors()){
                    return index(model);
                }

        Questionnaire questionnaire = new Questionnaire();

        BeanUtils.copyProperties(form, questionnaire);

        List<String> hobbyList = new ArrayList<>();
        for (Integer hobbyCode : form.getHobbyList()) {
            switch (hobbyCode) {
                case 1:
                    hobbyList.add("野球");
                    break;
                case 2:
                    hobbyList.add("サッカー");
                    break;
                case 3:
                    hobbyList.add("テニス");
                    break;
            }
        }
        questionnaire.setHobbyList(hobbyList);

        List<String> languageList = new ArrayList<>();
        for (Integer language : form.getLanguageList()) {
            switch (language) {
                case 1:
                    languageList.add("java");
                    break;
                case 2:
                    languageList.add("Python");
                    break;
                case 3:
                    languageList.add("Ruby");
                    break;
            }
        }
        questionnaire.setLanguageList(languageList);

        redirectAttributes.addFlashAttribute("questionnaire", questionnaire);

        return "redirect:/ex17/toresult";

    }

    @RequestMapping("/toresult")
    public String result() {
        return "result";
    }
}
