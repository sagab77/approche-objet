package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class ManipulationFichier {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\gabi\\IdeaProjects\\approche-objet\\recensement.csv");
        Path path1 = Paths.get("C:\\Users\\gabi\\IdeaProjects\\approche-objet\\recensement.csv");

        try {
            List<String> lines = readAllLines(path);
            ArrayList<String> newDatas = new ArrayList<>();
            Iterator<String> iterator = lines.iterator();
            iterator.next();

            while ((iterator.hasNext())) {
                String[] columns = iterator.next().replace(" ", "").split(";");
                if (Integer.parseInt(columns[9]) < 25000) {
                    iterator.remove();
                } else newDatas.add(columns[6] + ";" + columns[9]);

            }
            Files.write(path1, newDatas);


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(path1);

    }
}

       /* Path path = Paths.get("C:/Users/gabi/IdeaProjects/approche-objet/recensement.csv");

        boolean estFichier = Files.isRegularFile(path);
        boolean estLisible = Files.isReadable(path);
        System.out.println(estFichier);
        System.out.println(estLisible);

        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());
        System.out.println();

        Path pathDirectory = Paths.get("C:\\Users\\");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory)) {

            Iterator<Path> iterator = stream.iterator();
            while ((iterator.hasNext())) {
                Path path1 = iterator.next();
                System.out.println(path1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}*/

       /* List<String> lines = null;
        try {
            lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }*/


       /* Path path1 = Paths.get("C:/Users/gabi/Desktop/Diginamic/recensement.csv");
        Path pathDestination = Paths.get("C:/Users/gabi/IdeaProjects/approche-objet/src");
        try {
            Files.copy(path1,pathDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(pathDestination.getFileName());
    }*/

