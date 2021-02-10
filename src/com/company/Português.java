package com.company;

public class Português implements Dialog{

    String s = "Português";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "pressione q para parar";
    }

    @Override
    public String selectedLanguage() {
        return "o idioma selecionado é";
    }
}
