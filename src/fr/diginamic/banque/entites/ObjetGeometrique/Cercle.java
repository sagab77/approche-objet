package fr.diginamic.banque.entites.ObjetGeometrique;


import fr.diginamic.banque.entites.ObjetGeometrique.ObjetGeometrique;

public abstract class Cercle implements ObjetGeometrique {

    private int rayon;

    public Cercle(double rayon) {
        this.rayon = (int) rayon;
    }

    @Override
    public double perimetre() {
        return rayon * 2 * Math.PI;
    }

    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

}