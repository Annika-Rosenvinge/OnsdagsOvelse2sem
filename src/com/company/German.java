package com.company;

public class German implements Dialog {

    private String s = "german";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Drücken Sie y, um die Sprache zu ändern / drücken sie q, um zu stoppen ";
    }

    @Override
    public String selectedLanguage() {
        return "die ausgewählte Sprache ist ";
    }

    @Override
    public String changeLanguage() {
        return "Möchten Sie die Sprache ändern?";
    }
}
