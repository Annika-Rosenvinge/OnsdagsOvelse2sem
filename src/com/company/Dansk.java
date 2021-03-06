package com.company;

public class Dansk implements Dialog {

    private String s = "Dansk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Tryk y for at skifte sprog / tryk q for at stoppe programmet";
    }

    @Override
    public String selectedLanguage() {
        return "det valgte sprog er ";
    }

    @Override
    public String changeLanguage() {
        return "Vil du ændre sprog?";
    }
}
