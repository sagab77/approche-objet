package fr.diginamic.banque.entites.Banque;

import fr.diginamic.banque.entites.ObjetGeometrique.Operation;

public class  TestOperation extends Operation {


    public TestOperation(int date, double montant) {
        super(date, montant);
    }

    public static void main(String[] args) {

        Operation[] operations = new Operation[4];
        operations[0]  = new Credit(120515,1500);


        for (Operation operation:operations) {

            System.out.println();


        }



        }



        }








