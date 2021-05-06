package entites;

public class AdressePostale {

    public int number,code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String libelle,ville;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public AdressePostale(int number, int code, String libelle, String ville) {
        this.number = number;
        this.code = code;
        this.libelle = libelle;
        this.ville = ville;
    }
}


