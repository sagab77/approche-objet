package fr.diginamic.formes;

public class Rectangle extends Forme {

    double largeur = 8;
    double longuer = 5;
    @Override
    public double calculerSurface() {
        return largeur * longuer;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longuer + largeur);
    }
}


