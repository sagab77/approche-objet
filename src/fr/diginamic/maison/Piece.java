package fr.diginamic.maison;

public abstract class Piece {

    public int numero_etage;
    public double superficie;

    public Piece(int numero_etage,double superficie) {

        if(superficie < 0) {
            System.out.println("La superficie ne peux pas etre negative!");
        }

        this.superficie = superficie;
        this.numero_etage = numero_etage;
    }


}
