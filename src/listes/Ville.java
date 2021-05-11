package listes;


import java.util.ArrayList;
import java.util.Arrays;

public class Ville {

    public static void main(String[] args) {


        ArrayList<String> villes = new ArrayList<>(Arrays.asList(
                "Nice, 343 000 hab.",
                "Carcassonne, 47 800 hab.",
                "Narbonne, 53 400 hab.",
                "Lyon, 484 000 hab.",
                "Foix, 9 700 hab.",
                "Pau, 77 200 hab.",
                "Marseille, 850 700 hab.",
                "Tarbes, 40 600 hab."));

        // Je recupère la ville la plus peuplée

        int maxPop = 0;
        String villeMaxPop = "";
        int minPop = 1000000;
        int indexMinPop = -1;

        for (int i = 0; i < villes.size(); i++) {
            String ville = villes.get(i);
            String villeNom = ville.split(",")[0];
            String villePop = ville.split(",")[1];
            int pop = Integer.parseInt(
                    villePop.substring(0, villePop.indexOf("hab")).replace(" ", ""));
            if (pop > maxPop) {
                maxPop = pop;
                villeMaxPop = villeNom;
            }
            if (pop < minPop) {
                minPop = pop;
                indexMinPop = i;
            }
            if (pop > 100000) {
                villeNom = villeNom.toUpperCase();
                villes.set(i, villeNom + "," + villePop);
            }
        }
        System.out.println("La ville la plus peuplée est : " + villeMaxPop);

        villes.remove(indexMinPop);

        for (String city : villes) {
            System.out.println(city);
        }


    }
}





