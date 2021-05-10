package entites;

public class Spectacle {

    private String name;
    private String type;
    private double prix;
    private int cap_max;
    private int nb_spec;

    public Spectacle(String name, String type, double prix, int cap_max, int nb_spec) {
        this.name = name;
        this.type = type;
        this.prix = prix;
        this.cap_max = cap_max;
        this.nb_spec = nb_spec;
    }


}
