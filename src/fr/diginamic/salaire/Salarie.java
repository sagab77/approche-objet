package fr.diginamic.salaire;

public  class Salarie extends Intervenant {

     double salaireMensuel;

    public Salarie(String nom, String prenom, double salarie) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaireMensuel = salarie;
    }

    @Override
    public double getSalaire() {
        return salaireMensuel;
    }


}


