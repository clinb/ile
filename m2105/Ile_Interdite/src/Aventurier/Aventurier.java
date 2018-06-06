/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aventurier;

import Grille.*;

/**
 *
 * @author clinb
 */
public abstract class Aventurier {
    private String nom;
    private int numTourDeJeux;
    private int posI;
    private int posJ;
    private int PA;
    private Tuile caseDepart;
    private Grille grille = new Grille();

    public Aventurier(String nom, int numTourDeJeux, Tuile caseDepart) {
        this.nom = nom;
        this.numTourDeJeux = numTourDeJeux;
        this.caseDepart = caseDepart;
        this.posI = grille.getITuile(caseDepart);
        this.posJ = grille.getJTuile(caseDepart);
        this.PA = 3;
        grille.setGrille();
    }
    
    
    public void setPosI(){
        
    }
    
    public void setPosJ(){
    
    }
    
    public int getPosI(){
        this.posI = grille.getITuile(caseDepart);
        return posI;
    }
    public int getPosJ(){
        this.posJ = grille.getJTuile(caseDepart);
        return posJ;
    }
    
    public Tuile deplacementPossible(int i,  int j){
        
    }
    
    
    
    public void deplacement()
            
    
}
