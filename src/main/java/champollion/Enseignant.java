package champollion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;

public class Enseignant extends Personne {

    private final List<ServicePrevu> myServices = new LinkedList<>();
    private final Set<Intervention> intervention = new HashSet<>();
    // TODO : rajouter les autres méthodes présentes dans le diagramme UML

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures
     * équivalent TD" Pour le calcul : 1 heure de cours magistral vaut 1,5 h
     * "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut
     * 0,75h "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet
     * enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        int hEquivalentTD = 0;
        for (ServicePrevu s : myServices) {
            hEquivalentTD = (int) Math.round(hEquivalentTD + (s.getVolumeCM() * 1.5 + s.getVolumeTD() * 1 + s.getVolumeTP() * 0.75));
        }

        return (hEquivalentTD);
    }

    public boolean enSousService() {
        boolean sousService = false;
        if (this.heuresPrevues() < 192) {
            sousService = true;
        }
        return sousService;
        /*service annuelle 192
        si en dessous je suis en sous service */
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE
     * spécifiée en "heures équivalent TD" Pour le calcul : 1 heure de cours
     * magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent
     * TD" 1 heure de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet
     * enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        int hEquivalentTD = 0;
        for (ServicePrevu s : myServices) {
            if (s.getUe() == ue) {
                hEquivalentTD = (int) Math.round(hEquivalentTD + (s.getVolumeCM() * 1.5 + s.getVolumeTD() * 1 + s.getVolumeTP() * 0.75));
            }

        }
        return (hEquivalentTD);
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */

    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        ServicePrevu s = new ServicePrevu(volumeCM, volumeTD, volumeTP, this, ue);
        myServices.add(s);
    }

    public void ajouteIntervention(Intervention inter) {
        intervention.add(inter);
    }

    public int resteAPlanifier(UE ue, TypeIntervention type) {
        int sommePlanifiee = 0;

        for (Intervention inter : intervention) {
            if (inter.getIntervention().equals(type) && inter.getUe().equals(ue)) {
                sommePlanifiee += inter.getDuree();
            }
        }

        for (ServicePrevu s : myServices) {
            if (s.getUe().equals(ue)) {
                switch (type) {
                    case TP:
                        sommePlanifiee -= s.getVolumeTP();
                    case TD:
                        sommePlanifiee -= s.getVolumeTD();
                    case CM:
                        sommePlanifiee -= s.getVolumeCM();
                        break;
                }
            }

        }
        return (int) sommePlanifiee;

    }

}
