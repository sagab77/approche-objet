package fr.diginamic.banque.entites.Banque;

public class CompteTaux extends Compte {

    private double taxRem;
    protected int numCompte;
    protected double solde;

    public CompteTaux(int numCompte, double solde, double taxRem) {
        super(numCompte, solde);
        this.taxRem = taxRem;

    }


    @Override
    public int getNumCompte() {
        return numCompte;
    }

    @Override
    public String toString() {
        return "CompteTaux {" +
                "taxRem=" + taxRem +
                ", numCompte=" + numCompte +
                ", solde=" + solde +
                '}';
    }

    @Override
    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getTaxRem() {
        return taxRem;
    }

    public void setTaxRem(double taxRem) {
        this.taxRem = taxRem;
    }


}
