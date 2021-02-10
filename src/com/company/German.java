package com.company;

public class German implements Dialog {

    private String s = "german";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "drücken sie q, um zu stoppen ";
    }

    @Override
    public String selectedLanguage() {
        return "die ausgewählte Sprache ist ";
    }
}
