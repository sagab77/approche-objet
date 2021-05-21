package fr.diginamic.maps;

import fr.diginamic.testenumeration.Continent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePayParContinent {
    public static void main(String[] args) {

        ArrayList<Pays> paysArrayList = new ArrayList<>();
        paysArrayList.add(new Pays("France", 65, "Europe"));
        paysArrayList.add(new Pays("Allemagne", 80, "Europe"));
        paysArrayList.add(new Pays("Belgique", 10, "Europe"));
        paysArrayList.add(new Pays("Russie", 150, "Asie"));
        paysArrayList.add(new Pays("Chine", 1400000000, "Asie"));
        paysArrayList.add(new Pays("Indonesie", 220, "Oceanie"));
        paysArrayList.add(new Pays("Australie", 20, "Oceanie"));

        HashMap<Continent, Integer> paysParContinentMap = new HashMap<>();
        for (Pays pays : paysArrayList) {
            if (paysParContinentMap.equals(pays.getContinent()))
                paysParContinentMap.put(pays.getContinent(), paysParContinentMap.get(pays.getContinent()) + 1);
            else {
                paysParContinentMap.put(pays.getContinent(), 1);
            }
        }


        for (Map.Entry<Continent, Integer> stringIntegerEntry : paysParContinentMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }

    }


}



