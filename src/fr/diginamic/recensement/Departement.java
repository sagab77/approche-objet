package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;

public class Departement implements Comparable<Departement> {

    private String codeDepartement;
    private ArrayList<Ville> villes;
    private int populationDepartement;

    public Departement(Recensement recensement, String codeDep) {
    }


    @Override
    public int compareTo(Departement o) {
        return 0;
    }

    public Departement(String codeDepartement, ArrayList<Ville> villes, int populationDepartement) {
        this.codeDepartement = codeDepartement;
        this.villes = villes;
        this.populationDepartement = populationDepartement;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public ArrayList<Ville> getVilles() {
        return villes;
    }

    public void setVilles(ArrayList<Ville> villes) {
        this.villes = villes;
    }

    public int getPopulationDepartement() {
        return populationDepartement;
    }

    public void setPopulationDepartement(int populationDepartement) {
        this.populationDepartement = populationDepartement;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "codeDepartement='" + codeDepartement + '\'' +
                ", villes=" + villes +
                ", populationDepartement=" + populationDepartement +
                '}';
    }

    public void villesPlusPeuplees() {
        ArrayList<Ville> villes = this.getVilles();
        if (villes.size() == 0) {
            System.out.println("Le Département " + this.getCodeDepartement() + " est inconnu");
        } else {
            System.out.println("La Département " + this.getCodeDepartement() + " a " + villes.size() + " communes");
            //Collections.sort(villes);
            System.out.println("Les 10 villes les plus peuplées du département  " + this.getCodeDepartement() + " : ");
            for (int i = villes.size() - 1; i >= villes.size() - 10; i--) {
                System.out.println(villes.get(i).getNomCommune() + " de population " + villes.get(i).getPopulationTotale());
            }
        }
    }
}
