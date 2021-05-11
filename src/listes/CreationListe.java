package listes;


import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {

        List<Integer> nombres = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            nombres.add(i);

        }

            System.out.println("Taille de la liste " + nombres.size());




        }
    }

