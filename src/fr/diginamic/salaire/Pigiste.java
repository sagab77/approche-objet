package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

    int nbJour;
    double montantJour;


    public Pigiste(String nom, String prenom, int nbJour, double salarie) {

        this.nom = nom;
        this.prenom = prenom;
        this.nbJour = nbJour;
        this.montantJour = salarie;

    }

    @Override
    public double getSalaire() {
        return nbJour * montantJour;
    }
}

