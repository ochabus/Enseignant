/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package champollion;

import java.util.*;

/**
 *
 * @author chabus
 */
public class Intervention {

    public Date debut;
    public int duree;
    public boolean annulee;
    private int heureDebut;
    private final TypeIntervention intervention;
    private UE ue;

    public Intervention(Date debut, int duree, boolean annulee, int heureDebut, TypeIntervention intervention, UE ue) {
        this.debut = debut;
        this.duree = duree;
        annulee = false;
        this.heureDebut = heureDebut;
        this.intervention = intervention;
        this.ue = ue;
    }

    public int getDuree() {
        return duree;
    }

    public TypeIntervention getIntervention() {
        return intervention;
    }

    public UE getUe() {
        return ue;
    }

   


}
