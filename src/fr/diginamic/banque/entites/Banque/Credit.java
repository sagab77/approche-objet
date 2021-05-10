package fr.diginamic.banque.entites.Banque;

import fr.diginamic.banque.entites.ObjetGeometrique.Operation;

public class Credit extends Operation {



    public Credit(int date, double montant) {
        super(date, montant);
    }

    public String getType() {
        return "CREDIT";
    }
}
