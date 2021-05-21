package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopDep extends Services {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        String codeDepartement = scanner.next();
        int populationDepartement = 0;
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            if (ville.getCodeDep().equalsIgnoreCase(codeDepartement)) {
                System.out.println(ville);
                populationDepartement += ville.getPopulationTotale();
            }
        }
        System.out.println(" La population du departement " + codeDepartement + " est de " + populationDepartement);

    }

}





