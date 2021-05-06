package essais;

public class TestPersonne  {

    public static void main(String[] args) {

        Personne p1 = new Personne("Laurent","Lefevre","15 rue de Lodeve");
        Personne p2 = new Personne("Gabriel","Faure","48 rue de Faubourg");
        Personne p3 = new Personne("Nicholas","Moisand","10 rue de la Liberte");


        System.out.println(p1.returnPrenom() +  p2.getAdresse());
        System.out.println();

        p1.setNom("gabriel");
        System.out.println(p1.getNom());
    }



}
