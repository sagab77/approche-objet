package fr.diginamic.banque.entites;


public class TestBanque extends Compte{
    public TestBanque(double solde) {
        super(solde);
    }

    public TestBanque(int numCompte) {
        super(numCompte);
    }

    public static void main(String[] args) {

        Compte compte = new Compte(12345678,2800.50);
        Compte compte2 = new Compte(563248795,1500.50);


        System.out.println(compte);
        System.out.println(compte2);

    }
}
