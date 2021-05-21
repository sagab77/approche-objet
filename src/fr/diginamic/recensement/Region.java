package fr.diginamic.recensement;


import java.util.*;

import static java.util.Collections.*;

public class Region extends Services implements Comparable<Region> {
    private ArrayList<Departement> departements;
    private String nomRegion;
    private int populationRegion;
    private Object Ville;

    @Override
    public String toString() {
        return "Region{" +
                "departements=" + departements +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationRegion=" + populationRegion +
                '}';
    }

    public Region(Recensement recensement, String nomRegion) {
        this.nomRegion = nomRegion;
        this.populationRegion = 0;
        this.departements = new ArrayList<>();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                //System.out.println("je traite la ville " + ville);
                //Ajout departement si et seulement si departement n'existe pas encore dans l 'arraylist departements
                Departement dept = new Departement(recensement, ville.getCodeDep());
                //System.out.println(dept);
                if (!ListContainDepartement(this.departements, dept)) {
                    //System.out.println("Je traite le departement " + dept.getCodeDepartement());
                    this.departements.add(dept);
                    this.populationRegion += dept.getPopulationDepartement();
                }
            }
        }
    }


    public int getPopulationRegion() {
        return populationRegion;
    }

    public void setPopulationRegion(int populationRegion) {
        this.populationRegion = populationRegion;
    }

    public Region(ArrayList<Departement> departements, String nomRegion, int populationRegion) {
        this.departements = departements;
        this.nomRegion = nomRegion;
        this.populationRegion = populationRegion;
    }

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(ArrayList<Departement> regions) {
        this.departements = regions;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        scanner.nextLine();
        String nomRegion = scanner.nextLine();
        int populationRegion = 0;
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                System.out.println(ville);
                populationRegion += ville.getPopulationTotale();
            }
        }
        this.setPopulationRegion(populationRegion);
        System.out.println("La population de la région " + nomRegion + " est de : " + populationRegion);
    }

    
    @Override
    public int compareTo(Region reg) {
        return this.populationRegion - reg.populationRegion;
    }

  

    public boolean ListContainDepartement(ArrayList<Departement> departements, Departement dept) {

        for (Departement departement : departements) {
            if (departement.getCodeDepartement().equalsIgnoreCase(dept.getCodeDepartement())) {
                return true;
            }
        }
        return false;
    }

    public void villesLesPlusPeuplees() {
        ArrayList<Ville> villes = new ArrayList<>();
        ArrayList<Departement> departements = this.getDepartements();
        for (Departement departement : departements) {
            villes.addAll(departement.getVilles());
        }
        if (villes.size() == 0) {
            System.out.println("La region " + this.getNomRegion() + " est inconnue");
        } else {
            System.out.println("La région " + this.getNomRegion() + " a " + villes.size() + " communes");
            sort(unmodifiableList(villes));
            System.out.println("Les 10 villes les plus peuplées de la région " + this.getNomRegion() + " : ");
            for (int i = villes.size() - 1; i >= villes.size() - 10; i--) {
                System.out.println(villes.get(i).getNomCommune() + " de population " + villes.get(i).getPopulationTotale());
            }
        }
    }

    private void sort(List<fr.diginamic.recensement.Ville> unmodifiableList) {
    }


}

