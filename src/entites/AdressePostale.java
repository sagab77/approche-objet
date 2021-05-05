package entites;

public class AdressePostale {

    public int number;
    public String libelle,code,ville;

    public AdressePostale(int number, String libelle, String code, String ville) {

        this.number = number;
        this.libelle = libelle;
        this.code = code;
        this.ville = ville;
    }
}
