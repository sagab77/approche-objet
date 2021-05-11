package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> nombres = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        int max = 0;
        int min = 0;

        System.out.println("Afficher la liste : ");

        for (Integer nombre : nombres) {
            max = nombre > max ? nombre : max;
            min = nombre < min ? nombre : min;

            System.out.println(nombre);
        }

        System.out.println("La taille de la liste est :  " + nombres.size());

        System.out.println("La valeur maximale est : " + max);
        nombres.remove((Object) min);
        System.out.println("La valeur minimale est : " + min + " (supprimer)");

        for (int i = 0; i < nombres.size(); i++) {
            int currentInt = nombres.get(i);
            if (currentInt < 0) {
                nombres.set(i, currentInt * -1);
            }
        }
        System.out.println("La liste sans les numeros negatifs est : ");
        for (Integer entier : nombres) {
            System.out.print(entier + " ");
        }

    }
}






                        












