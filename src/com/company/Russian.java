package com.company;

public class Russian implements Dialog{

    private String s = "Russian";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "нажмите q для выхода";
    }

    @Override
    public String selectedLanguage() {
        return "выбранный язык ";
    }
}
