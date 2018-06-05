/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tresor;

/**
 *
 * @author clinb
 */
public class Tresor {
    private Relique nomTresor;
    private boolean disponibilite;
    
    public boolean tresorDispo() {
        return disponibilite;
    }
    
    public void setTresorDispo(boolean dispo) {
        this.disponibilite = dispo;
    }
}
