package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps", 1),
    ETE("Ete", 2),
    AUTOMNE("Automne", 3),
    HIVER("HIver", 4);


    @Override
    public String toString() {
        return "Saison{" +
                "libelle='" + libelle + '\'' +
                ", ordre=" + ordre +
                '}';
    }

    private final String libelle;
    private final int ordre;


    Saison(String libelle, int ordre) {
        this.libelle = libelle;
        this.ordre = ordre;
    }

    public String getLibelle() {
        return libelle;
    }



    public int getOrdre() {
        return ordre;
    }



    public static Saison getSaisonFromLibelle(String libelle) {
        for (Saison saison : Saison.values()) {
            if (saison.libelle.equals(libelle))
                return saison;
        }
        return null;
    }
}


