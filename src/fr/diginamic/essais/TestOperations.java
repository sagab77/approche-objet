package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations extends Operations {

    public static void main(String[] args) {

        double a = 15;
        double b = 5;


        double add = Operations.calcul(a,b,'+');
        double min = Operations.calcul(a,b,'-');
        double multip = Operations.calcul(4, 3, '*');
        double divide = Operations.calcul(4, 3, '/');
        double unknown = Operations.calcul(4, 3, '&');


        System.out.println(a + " + " + b +" = " + add);
        System.out.println(a + " - " + b +" = " + min);
        System.out.println(a + " * " + b +" = " + multip);
        System.out.println(a + " / " + b +" = " + divide);
        System.out.println(a + " & " + b +" = " + unknown);

    }
}
