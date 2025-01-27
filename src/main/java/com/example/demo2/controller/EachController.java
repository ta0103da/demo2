package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Item;

@Controller
@RequestMapping("/each")
public class EachController {

    @RequestMapping("")
    public String index(Model model){

        // List<String> itemList = new ArrayList<>();
        // itemList.add("えんぴつ");
        // itemList.add("消しゴム");
        // itemList.add("ホチキス");

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("えんぴつ",120,"黒"));
        itemList.add(new Item("パソコン",190000,"シルバー"));
        itemList.add(new Item("水筒",1500,"水色"));


        model.addAttribute("itemList", itemList);
        return "each";
    }
}
