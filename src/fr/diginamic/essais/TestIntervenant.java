package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

import java.util.Locale;


public class TestIntervenant {

    public static void main(String[] args) {

         Salarie salarie = new Salarie("Lefevre","Laurent",1800);
         Pigiste pigiste = new Pigiste("Moisand","Frederic",21,110);


        System.out.println("Le salarie du salarie  " + salarie.nom + " " + salarie.prenom + " est de " + salarie.getSalaire());
        System.out.println("Le salarie du pigiste  " + pigiste.nom + " " + pigiste.prenom + " est de " + pigiste.getSalaire());
        System.out.println();

        System.out.println(salarie.afficherDonnees());
        System.out.println();

        System.out.println(pigiste.afficherDonnees());


    }
}