package fr.diginamic.salaire;

public abstract class Intervenant {

    public String nom;
    public String prenom;


    public abstract double getSalaire();

    public String afficherDonnees() {

        String result = "Nom : " + this.nom
                + "\nPrénom : " + this.prenom
                + "\nSalaire : " + getSalaire()
                + "\nStatut : " + this.getClass().getSimpleName();

        return result;


    }
}
