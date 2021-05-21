package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopVille extends Services {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        scanner.nextLine();
        String nomVille = scanner.nextLine();
        System.out.println("Nom de la commune " + nomVille);
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        boolean trouve = false;
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            if (ville.getNomCommune().equalsIgnoreCase((nomVille))) {
                System.out.println(ville);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Ville inconnue");
        }
    }
}