package Grille;

import Tuile.Tuile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clinb
 */
public class Grille {
    Tuile tableauTuile[][] = new Tuile[6][6];
    
    public Tuile getTuile(int posX, int posY) {
        return tableauTuile[posX][posY];
    }
}
