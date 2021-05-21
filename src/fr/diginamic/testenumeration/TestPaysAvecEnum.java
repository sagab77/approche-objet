package fr.diginamic.testenumeration;

import fr.diginamic.maps.Pays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPaysAvecEnum {
    public static void main(String[] args) {

        for (Saison saison : Saison.values()) {
            System.out.println(saison);
        }

        System.out.println(Saison.valueOf("ETE"));

        Saison hiver = Saison.getSaisonFromLibelle("Hiver");
        System.out.println(hiver);



    }
    }

