package entites;

public class TheatrePro {

    public String nom_spectacle;
    public Spectacle[] spectacles = new Spectacle[0];
    public double total = 0;

    public TheatrePro(String nom_spectacle) {
        this.nom_spectacle = nom_spectacle;
    }

    public void ajouterSpectacle(Spectacle newSpectacle) {

        Spectacle[] newSpectacles = new Spectacle[spectacles.length + 1];
        newSpectacles[this.spectacles.length] = newSpectacle;

        for (int i = 0; i < this.spectacles.length; i++) {

            newSpectacles[i] = this.spectacles[i];
            
        }

        this.spectacles = newSpectacles;

    }

    public Spectacle getSpectacles(String nom_spectacle) {

        Spectacle res = null;
        for(Spectacle spectacle : this.spectacles) {
            if(spectacle.equals(nom_spectacle)) {
                res = spectacle;
            }
        }
       return  res;
    }


            }





