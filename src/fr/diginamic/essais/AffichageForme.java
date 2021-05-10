package fr.diginamic.essais;

import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class AffichageForme extends Forme {


    @Override
    public double calculerSurface() {
        return 0;
    }

    @Override
    public double calculerPerimetre() {
        return 0;
    }

    public double afficher(double longuer,double largeur) {
        return largeur * longuer;
    }
}















