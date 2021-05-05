package essais;

import entites.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        Personne p = new Personne("Dupont","Laurent","15 Allee de Paris");
        Personne p1 = new Personne("Lefevre","Pascal");


        System.out.println(p.adresse);

    }
}
