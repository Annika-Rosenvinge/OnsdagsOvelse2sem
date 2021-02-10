package com.company;

public class Tysk implements Dialog{
    private String s = "Deutsch";
    @Override
    public String getLanguage(){return s;}
    @Override
    public String quit(){return "Drücke q zum beenden";}
    @Override
    public String selectedLanguage() {return "Die ausgewählte Sprache ist:"; }

    @Override
    public String changeLanguage() {
        return "Möchten Sie die Sprache ändern?";
    }
}
