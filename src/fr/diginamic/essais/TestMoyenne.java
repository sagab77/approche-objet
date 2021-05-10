package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {

        CalculMoyenne calculMoyenne1 = new CalculMoyenne();
        CalculMoyenne calculMoyenne2 = new CalculMoyenne();

        calculMoyenne1.ajout(12);
        calculMoyenne1.ajout(18);
        calculMoyenne1.ajout(20);
        calculMoyenne1.ajout(11);
        calculMoyenne1.ajout(6);
        calculMoyenne1.ajout(20);

        calculMoyenne2.ajout(14);
        calculMoyenne2.ajout(18);
        calculMoyenne2.ajout(20);
        calculMoyenne2.ajout(8);
        calculMoyenne2.ajout(11);
        calculMoyenne2.ajout(19);
        calculMoyenne2.ajout(14);
        calculMoyenne2.ajout(16);




        System.out.print("Les valeurs sont : ");

        for (double value : calculMoyenne1.array) {
            System.out.print(value + " ");
        }
        System.out.println("\nMoyenne est : " + calculMoyenne1.calcul());

        System.out.print("\nLes valeurs sont : ");
        for (double value : calculMoyenne2.array) {
            System.out.print(value + " ");
        }
        System.out.println("\nMoyenne est : " + calculMoyenne2.calcul());
    }


}

