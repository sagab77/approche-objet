package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {


        Maison maison = new Maison();

        maison.ajouterPiece(new Chambre(0,12));
        maison.ajouterPiece(new WC(0,5));
        maison.ajouterPiece(new Salon(0,50));
        maison.ajouterPiece(new SalleDeBain(0,8));
        maison.ajouterPiece(new Cuisine(0,15));
        maison.ajouterPiece(new Chambre(0,20));
        maison.ajouterPiece(new Chambre(0,18));

        maison.ajouterPiece(new Chambre(1,12));
        maison.ajouterPiece(new WC(1,5));
        maison.ajouterPiece(new Salon(1,50));
        maison.ajouterPiece(new SalleDeBain(1,8));
        maison.ajouterPiece(new Cuisine(1,15));
        maison.ajouterPiece(new Chambre(1,20));
        maison.ajouterPiece(new Chambre(1,18));






        System.out.println("Superficie de la maison : " + maison.surfaceTotale());
        System.out.println("Superficie du rdc : " + maison.etageSurface(0));
        System.out.println("Superficie du premier etage : " + maison.etageSurface(1));


        System.out.println("La surface totale des chambres est de " + maison.chambreSurface(Chambre.class));
        System.out.println("La surface totale des WC est de " + maison.chambreSurface(WC.class));
        System.out.println("Il y a " + maison.nombreChambre(SalleDeBain.class) + " salles de bain dans la maison.");


    }
}
