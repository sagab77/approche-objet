package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Arrays;

public class Ville implements Comparable<Ville> {

    public String nomVille;
    public int nbHabitants;

    @Override
    public int compareTo(Ville o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nomVille='" + nomVille + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }


    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public Ville(String nomVille, int nbHabitants) {
        this.nomVille = nomVille;
        this.nbHabitants = nbHabitants;


    }


   /* @Override
    public int compareTo(Ville o) {
        return this.nomVille.compareTo(o.getNomVille());
    }*/
}

