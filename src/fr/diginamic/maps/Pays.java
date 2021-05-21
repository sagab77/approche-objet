package fr.diginamic.maps;

import fr.diginamic.testenumeration.Continent;

public class Pays {


    private String nom;
    private int nombreHabitants;
    private Continent continent;

    public Pays(String nom, int nbHabitants, String continent) {
        this.nom = nom;
        this.nombreHabitants = nbHabitants;

    }

    public Pays(String france, int nbHabitants, Continent europe) {
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nombreHabitants +
                ", continent=" + continent +
                '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nombreHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nombreHabitants = nbHabitants;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }











//    public boolean equals(Object o) {
//        if (this.equals(o))
//            return nom.equals(Pays o);
//        if (o.equals(null))
//            return false;
//
//        return false;
    }










