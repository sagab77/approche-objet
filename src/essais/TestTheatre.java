package essais;

import entites.Theatre;

import java.util.concurrent.ThreadLocalRandom;

public class TestTheatre {
    public static void main(String[] args) {

        Theatre moliere = new Theatre("Corum",4800,0,0);
        boolean notFull = true;

        while(notFull) {
            int newClients = ThreadLocalRandom.current().nextInt(1,5);
            notFull = moliere.inscrire(4700,25);

        }

        System.out.println("Total clients inscrit : " + moliere.getInscrits());
        System.out.println("Total recette : " + moliere.recette + " €");



    }


}


