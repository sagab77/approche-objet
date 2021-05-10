package fr.diginamic.banque.entites.Banque;

public class Compte  {

    private static int ct = 1;
    public int numCompte;
    public double solde;

    public Compte(int numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    public static int getCt() {
        return ct;
    }

    public static void setCt(int ct) {
        Compte.ct = ct;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public Compte(int numCompte, double v, double solde) {
        this.solde = solde;
        this.numCompte = ct++;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte = " + numCompte +
                ", solde = " + solde +
                '}';
    }

    public Compte(int numCompte) {
        this.numCompte = numCompte;
    }


}


