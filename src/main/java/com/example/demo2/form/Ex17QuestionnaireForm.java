package com.example.demo2.form;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Ex17QuestionnaireForm {
    // 名前
    @Size(min=1,max = 127,message="1桁以上、127桁以下で入力してください")
    @NotBlank(message="値を入力してください")
    private String name;
    // メールアドレス
    @Size(min=1,max = 127,message="1桁以上、127桁以下で入力してください")
    @Email(message="Eメール形式が不正です")
    private String email;
    // 性別
    @NotBlank(message="値を入力してください")
    private String gender;
    // 趣味リスト
    @NotEmpty(message = "値を入力してください")
    private List<Integer> hobbyList;
    // 好きな言語リスト
    private List<Integer> languageList;
    // その他
    @Size(min=1,max = 2000,message="1桁以上、2000桁以下で入力してください")
    private String other;

    
    @Override
    public String toString() {
        return "Ex17QuestionnaireForm [name=" + name + ", email=" + email + ", gender=" + gender + ", hobbyList="
                + hobbyList + ", languageList=" + languageList + ", other=" + other + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<Integer> getLanguageList() {
        return languageList;
    }
    public void setLanguageList(List<Integer> languageList) {
        this.languageList = languageList;
    }
    public String getOther() {
        return other;
    }
    public void setOther(String other) {
        this.other = other;
    }

    
}
