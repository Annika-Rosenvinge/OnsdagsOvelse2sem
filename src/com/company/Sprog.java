package com.company;

import java.util.HashMap;

public class Sprog  {

    private HashMap<String, Dialog> dialoger = new HashMap<>();

    public Sprog() {


        // her tilføjer du ny sprog
        dialoger.put("da", new Dansk());
        dialoger.put("eng", new English());
        dialoger.put("ger", new German());
        dialoger.put("rus", new Russian());
        dialoger.put("fre", new French());
        dialoger.put("po", new Português());

    }
    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }
}
