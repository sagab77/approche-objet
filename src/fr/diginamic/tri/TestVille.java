package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {

    public int nbHabitant;


    @Override
    public String toString() {
        return "TestVille{}";
    }

    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();

        villes.add(new Ville("NIce", 343000));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Carcasonne", 47800));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));


        Collections.sort(villes);


        System.out.println(villes);


    }


}

