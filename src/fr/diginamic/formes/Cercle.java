package fr.diginamic.formes;

public class Cercle extends Forme {

    double rayon = 5;

    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}