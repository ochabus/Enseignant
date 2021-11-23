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
    public boolean annulee = false;
    private int heureDebut;

    public Intervention(Date debut, int duree, boolean annulee, int heureDebut) {
        this.debut = debut;
        this.duree = duree;
        this.annulee = annulee;
        this.heureDebut = heureDebut;
        
    }
    
    
    
}
