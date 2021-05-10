package fr.diginamic.banque.entites.Banque;

import fr.diginamic.banque.entites.ObjetGeometrique.Operation;

public class Debit extends Operation {


    private static String DEBIT;

    public Debit(int date, double montant) {
        super(date, montant);
    }

    private static void amountDebit() {

    }
    private static void newSolde() {

    }
    public static String getType() {
        return DEBIT;
    }
}
