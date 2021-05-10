package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;


public class TestForme  {

    public static void main(String[] args) {

        Cercle cercle = new Cercle();
        cercle.calculerSurface();
        System.out.println("La surface du cercle est : " + cercle.calculerSurface());

        System.out.println("La surface du rectangle est : " + new Rectangle().calculerSurface());

        System.out.println("Le perimetre du carre est : " + new Carre().calculerPerimetre());













    }


}
