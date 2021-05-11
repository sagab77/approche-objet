package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> newList = new ArrayList<>();
        newList.addAll(liste1);
        newList.addAll(liste2);

        for (String s : newList) {
            System.out.println(s);

        }
    }
}



      /*  newList = new ArrayList<>();
        for(String s : liste1) {
            if(newList.contains(s))   {
                newList.add(s);
            }
            System.out.println(s);
        }*/





