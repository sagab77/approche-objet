package essais;

public class Personne {


    private String nom, prenom, adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public Personne(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void displayNom() {

        System.out.println(nom.toUpperCase() + prenom);

    }

    public void displayPrenom() {

        System.out.println(prenom);

    }

    public void modif() {

        System.out.println(adresse);
    }

    public String returnNom() {
        return nom;
    }

    public String returnPrenom() {
        return prenom;
    }

    public String returnAddresse() {
        return adresse;
    }


}


