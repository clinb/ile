/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grille;

/**
 *
 * @author clinb
 */
public class Tuile{
    private String nomTuile;
    private EtatTuile etatTuile;
    private TypeTuile typeTuile;
    private int posI;
    private int posJ;

    public Tuile(String nomTuile, EtatTuile etatTuile, TypeTuile typeTuile) {
        this.nomTuile = nomTuile;
        this.etatTuile = etatTuile;
        this.typeTuile = typeTuile;
    }

    public String getNomTuile() {
        return nomTuile;
    }
    
    public EtatTuile getEtatTuile(){
        return etatTuile;
    }
    public void setEtatTuile(EtatTuile e){
        this.etatTuile=e;
    }
    
    
    
}
