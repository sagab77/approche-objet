package fr.diginamic.banque.entites.ObjetGeometrique;

public class TestObjetGeometrique {

    public static void main(String[] args) {



            ObjetGeometrique[] objetGeometriques = new ObjetGeometrique[2];
            objetGeometriques[0] = new Cercle(4) {
                @Override
                public double perimetre(int Largeur, int longuer) {
                    return 0;
                }

                @Override
                public double perimetre(int rayon) {
                    return 0;
                }
            };
            objetGeometriques[1] = new Rectangle(2, 4) {
                @Override
                public double perimetre(int Largeur, int longuer) {
                    return 0;
                }
            };

            for (ObjetGeometrique o : objetGeometriques) {
                System.out.println(o);
                System.out.println("surface : " + o.surface());
                System.out.println("perimetre : " + o.perimetre());
            }

        }



    }






