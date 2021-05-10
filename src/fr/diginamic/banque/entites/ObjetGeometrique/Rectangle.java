package fr.diginamic.banque.entites.ObjetGeometrique;

import fr.diginamic.banque.entites.ObjetGeometrique.ObjetGeometrique;

public abstract class Rectangle implements ObjetGeometrique {

    private double longueur, largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return longueur * largeur * 2;
    }


    @Override
    public double perimetre(int rayon) {
        return 0;
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }

}