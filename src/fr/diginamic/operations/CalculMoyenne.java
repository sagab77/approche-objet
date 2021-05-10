package fr.diginamic.operations;

public class CalculMoyenne {


    public double[] array = new double[0];

    public CalculMoyenne() {

    }

    public void ajout(double value) {

        double[] newArray = new double[array.length + 1];
        newArray[array.length] = value;

        // Copy the values in the new array

        for (int i = 0; i < array.length; i++) {

            newArray[i] = this.array[i];

        }

        // replace array

        this.array = newArray;

    }

    public double calcul() {
        double total = 0;

        for (double value : this.array) {

            total += value;

        }

        return total / array.length;

    }
}










