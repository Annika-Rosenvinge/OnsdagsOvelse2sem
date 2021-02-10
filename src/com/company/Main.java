package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dialog dialog = new English();

        Sprog sprog = new Sprog();

        while (!getString("Press y for language change / Press q for exit" ).equalsIgnoreCase("q") )  {


            if(getString("change language ? y/n").equalsIgnoreCase("y")) {

                dialog = sprog.SkiftSprog(getString("da / eng / ger / rus / fre / po "));

            }
            System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage());

        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + " : ");

        return scanner.nextLine();

    }
}
