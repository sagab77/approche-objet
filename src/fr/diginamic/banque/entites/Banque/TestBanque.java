package fr.diginamic.banque.entites.Banque;


public class TestBanque extends Compte {


    public TestBanque(int numCompte, double solde) {
        super(numCompte, solde);
    }

    public static void main(String[] args) {


        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(124589, 5000);
        comptes[1] = new CompteTaux(1234523, 2500, 1200);

        for (Compte compte : comptes) {

            System.out.println(compte);


        }


    }


}

