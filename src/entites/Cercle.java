package entites;

public class Cercle {

    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
        return rayon * 2 * Math.PI;
    }

    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }


}

