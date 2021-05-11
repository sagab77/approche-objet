package listes;

import java.util.*;


public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<>(Arrays.asList("Nice", "Carcasonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        // La ville qui a plus des lettres
        String plus = villes.get(0);

        for (String ville : villes) {

            if (ville.length() > plus.length())
                plus = ville;

        }
        System.out.println(plus);

        // Toutes les villes avec les majuscules

        for (int i = 0; i < villes.size(); i++) {

            villes.set(i, villes.get(i).toUpperCase(Locale.ROOT));

        }

        Iterator<String> i = villes.iterator();
        while (i.hasNext()) {
            if (i.next().charAt(0) == 'N') {
                i.remove();
            }

            for (String ville : villes) {
                System.out.println(ville);
            }
        }

    }


}







