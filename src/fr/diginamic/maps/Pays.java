package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Pays {

    String nom;

    int nbHabitants;
    String continent;

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", continent='" + continent + '\'' +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Pays(String nom, int nbHabitants, String continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }







}
