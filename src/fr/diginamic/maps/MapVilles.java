package fr.diginamic.maps;

import fr.diginamic.maps.Ville;

import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {

        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));
        mapVilles.put("Carcasonne", new Ville("Carcasonne", 47800));

        String vileKeyMinHab = null;


        for (Map.Entry<String, Ville> stringVilleEntry : mapVilles.entrySet()) {

            if (vileKeyMinHab == null) {
                vileKeyMinHab = stringVilleEntry.getKey();
            } else {
                if (stringVilleEntry.getValue().getNbHabitants() < mapVilles.get(vileKeyMinHab).getNbHabitants())
                    vileKeyMinHab = stringVilleEntry.getKey();


            }
            mapVilles.remove(vileKeyMinHab);

            for (Ville value : mapVilles.values()) {


                System.out.println(value);
            }
        }
    }
}
