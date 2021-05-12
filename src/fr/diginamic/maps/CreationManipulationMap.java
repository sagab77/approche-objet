package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class CreationManipulationMap {

    public static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");


        for(Map.Entry<Integer, String> entry : mapVilles.entrySet()) {
            Integer key  = entry.getKey();
            String value = entry.getValue();

            System.out.println("Clé " + key + " , value " + value);



        }

        System.out.println(mapVilles.size());



        }

    }



