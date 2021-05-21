package fr.diginamic;

import essais.Personne;
import fr.diginamic.maps.Pays;

public class TestEquals {
    public static void main(String[] args) {


        String nom;
        int nbHabitants;

        Pays pays = new Pays("France", 65000000, "Europe");
        Pays pays2 = new Pays("Australie", 25000000, "Oceanie");
        Pays pays3 = new Pays("Canada", 1500000, "Amerique du Nord");

        if (pays.equals(pays))
            System.out.println("C'est le meme pays");
        if (!pays.equals(pays2))
            System.out.println("Is not the  same country!");
    }


}










