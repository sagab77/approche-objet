package fr.diginamic.maps;

public class Ville {



        public String nomVille;
        public int nbHabitants;



        @Override
        public String toString() {
            return "Ville{" +
                    "nomVille='" + nomVille + '\'' +
                    ", nbHabitants=" + nbHabitants +
                    '}';
        }


        public String getNomVille() {
            return nomVille;
        }

        public void setNomVille(String nomVille) {
            this.nomVille = nomVille;
        }

        public int getNbHabitants() {
            return nbHabitants;
        }

        public void setNbHabitants(int nbHabitants) {
            this.nbHabitants = nbHabitants;
        }

        public Ville(String nomVille, int nbHabitants) {
            this.nomVille = nomVille;
            this.nbHabitants = nbHabitants;


        }

    }
