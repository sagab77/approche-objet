package fr.diginamic.chaines;

import entites.Salarie;

import java.util.Locale;

public class ManipulationChaine {
    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);

        String substring = "";
        String substring1 = "";
        String substring2 = "";


        substring = chaine.substring(0, 6);
        substring1 = chaine.substring(7, 13);
        substring2 = chaine.substring(14, 21);


        System.out.println("Premier charactere: " + premierCaractere);
        System.out.println(chaine.length());
        System.out.println(chaine.indexOf(chaine));
        System.out.println("Le nom de famille est : " + substring);
        System.out.println("LE NOM DE FAMILLE EN MAJUSCULES :" + substring.toUpperCase(Locale.ROOT));
        System.out.println("le nom de famille en minuscules: " + substring.toLowerCase());
        System.out.println(substring);


        String[] arrayString = chaine.split(";");

        for (String s : arrayString) {
            System.out.println(s);
        }


        Salarie salarie = new Salarie(substring, substring1, substring2);

        substring2.replace("", "").trim();

        double d = Double.parseDouble(substring2.replace(" ", ""));


        System.out.println("Salarie est : " + substring + " " + substring1 + " " + d);


    }


}

