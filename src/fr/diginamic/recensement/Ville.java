package fr.diginamic.recensement;

public class Ville {

    private String codeRegion;
    private String nomRegion;
    private String codeDep;
    private String codeCommune;
    private String nomCommune;
    private int populationTotale;

    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDep = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "codeRegion='" + codeRegion + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", codeDepartement='" + codeDep + '\'' +
                ", codeCommune='" + codeCommune + '\'' +
                ", nomCommune='" + nomCommune + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getCodeDep() {
        return codeDep;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDep = codeDepartement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(String codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }
}