package essais;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

    public static void main(String[] args) {

        // Cercle cercle = new Cercle(5);
        // Cercle cercle1 = new Cercle(18);

        Cercle cercle = CercleFactory.newCercle(10);
        Cercle cercle1 = CercleFactory.newCercle(12);


        System.out.println("Le perimetre du cercle est : " + cercle.perimetre() + " et il a  une surface de " + cercle.surface());
        System.out.println("Le perimetre du cercle est : " + cercle1.perimetre() + " et il a  une surface de " + cercle1.surface());

    }
}
