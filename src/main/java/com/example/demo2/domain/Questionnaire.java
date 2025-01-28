package com.example.demo2.domain;

import java.util.List;

public class Questionnaire {
    // ID
    private Integer id;
    // 名前
    private String name;
    // 性別
    private String gender;
    // メールアドレス
    private String email;
    // 趣味リスト
    private List<String> hobbyList;
    // 言語リスト
    private List<String> languageList;
    // その他
    private String other;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<String> getLanguageList() {
        return languageList;
    }
    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getOther() {
        return other;
    }
    public void setOther(String other) {
        this.other = other;
    }

    
}
