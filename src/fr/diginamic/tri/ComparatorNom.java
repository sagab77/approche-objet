package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

    public int compNom;
    @Override
    public int compare(Ville o1, Ville o2) {
        int result = o1.nomVille.compareTo(o2.nomVille);
        return result;
    }


}
