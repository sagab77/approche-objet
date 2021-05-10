package entites;

public class Theatre {

    public String name;
    public int cap_max;
    public int inscrits;
    public double recette;

    public Theatre(String name, int cap_max, int clients, double recette) {
        this.name = name;
        this.cap_max = cap_max;
        this.inscrits = inscrits;
        this.recette = recette;
    }

    public boolean inscrire(int clients, double prix) {
        int total = inscrits + clients;

        if (total > cap_max) {
            System.out.println("Il n'y a plus des places disponibles!");
            return false;
        } else {
            inscrits = total;
            recette += prix * clients;
            return true;
        }
    }


}

