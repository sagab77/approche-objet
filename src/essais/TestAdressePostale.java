package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestAdressePostale {

    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale(12,"Rue de Moulin","34052","Montpellier");
        AdressePostale adresse2 = new AdressePostale(895,"Rue des martires","45026","Paris");

        System.out.println(adresse1.ville);



        }
    }

