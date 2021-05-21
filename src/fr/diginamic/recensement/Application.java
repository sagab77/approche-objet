package fr.diginamic.recensement;


import fr.diginamic.maps.MapVilles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Application<sortir> {
    public static void
    main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/gabi/Desktop/Diginamic/recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        ArrayList<Ville> villes = new ArrayList<>();
        Iterator<String> iterator = lines.iterator();
        System.out.println(iterator.next());  // On va lire la premiere ligne

        while (iterator.hasNext()) {
            String line = iterator.next();
            String[] tabLine = line.split(";");
            Ville ville = new Ville(tabLine[0], tabLine[1], tabLine[2], tabLine[5], tabLine[6], Integer.parseInt((tabLine[9]).replaceAll(" ", "")));
            villes.add(ville);
            if (ville.getNomCommune().startsWith("Montpellier")) ;
            System.out.println(ville);
        }

        System.out.println(villes.size());

    }
}









        /*List<String> res = new ArrayList<>();
        for (String i : res) {
            if(i.contains("Montpellier")) {
                System.out.println(res);
            }
            
        }

        try {
            lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : lines) {
            System.out.println(line);
        }



        System.out.println();


    }

   List<Ville> villes = new ArrayList<>();*/
































