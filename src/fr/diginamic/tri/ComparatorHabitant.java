package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    public int nbHabitant;


    @Override
    public int compare(Ville o1, Ville o2) {
        int result =  o1.nomVille.compareTo(o2.nomVille);
        return result;
    }
}