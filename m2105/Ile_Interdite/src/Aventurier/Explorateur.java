/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aventurier;

import Grille.Tuile;

/**
 *
 * @author clinb
 */
public class Explorateur extends Aventurier {
    
    public Explorateur(String nom, int numTourDeJeux, Tuile caseDepart) {
        super(nom, numTourDeJeux, caseDepart);
    }
    public void assecherExplorateur(){
        
        super.assecher();
        
    }
    
}
