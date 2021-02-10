package com.company;

public class English implements Dialog{

    private String s = "English";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Press Y to change language / press q for quit";
    }

    @Override
    public String selectedLanguage() {
        return "the selected language is ";
    }
}
