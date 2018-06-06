package Grille;

import Grille.Tuile;

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
    
    public Tuile getTuile(int posI, int posJ) {
        return tableauTuile[posI][posJ];
    }
    
    public void setGrille() {
        tableauTuile[0][0] = new Tuile(null, null, null);
        tableauTuile[0][1] = new Tuile(null, null, null);
        tableauTuile[0][2] = new Tuile("pontDesAbimes", EtatTuile.seche, TypeTuile.tuileClassique);
        tableauTuile[0][3] = new Tuile("porteDeBronze", EtatTuile.seche, TypeTuile.tuileDepart);
        tableauTuile[0][4] = new Tuile(null, null, null);
        tableauTuile[0][5] = new Tuile(null, null, null);
        tableauTuile[1][0] = new Tuile(null, null, null);
        tableauTuile[1][1] = new Tuile("caverneDesOmbres", EtatTuile.seche, TypeTuile.tuileTresor);
        tableauTuile[1][2] = new Tuile("porteDeFer", EtatTuile.seche, TypeTuile.tuileDepart);
        tableauTuile[1][3] = new Tuile("porteDOr", EtatTuile.seche, TypeTuile.tuileDepart);
        tableauTuile[1][4] = new Tuile("falaisesDeLOubli", EtatTuile.seche, TypeTuile.tuileClassique);
        tableauTuile[1][5] = new Tuile(null, null, null);
        tableauTuile[2][0] = new Tuile("palaisDeCorail", EtatTuile.seche, TypeTuile.tuileTresor);
        tableauTuile[2][1] = new Tuile("porteDArgent", EtatTuile.seche, TypeTuile.tuileDepart);
        tableauTuile[2][2] = new Tuile("dunesDeLIllusion", EtatTuile.coulee, TypeTuile.tuileClassique);
        tableauTuile[2][3] = new Tuile("heliport", EtatTuile.seche, TypeTuile.tuileDepart);
        tableauTuile[2][4] = new Tuile("porteDeCuivre", EtatTuile.seche, TypeTuile.tuileDepart);
        tableauTuile[2][5] = new Tuile("jardinDesHurlements", EtatTuile.seche, TypeTuile.tuileTresor);
        tableauTuile[3][0] = new Tuile("foretPourpre", EtatTuile.seche, TypeTuile.tuileClassique);
        tableauTuile[3][1] = new Tuile("lagonPerdu", EtatTuile.inondee, TypeTuile.tuileClassique);
        tableauTuile[3][2] = new Tuile("maraisBrumeux", EtatTuile.coulee, TypeTuile.tuileClassique);
        tableauTuile[3][3] = new Tuile("observatoire", EtatTuile.inondee, TypeTuile.tuileClassique);
        tableauTuile[3][4] = new Tuile("rocherFantome", EtatTuile.coulee, TypeTuile.tuileClassique);
        tableauTuile[3][5] = new Tuile("caverneDuBrasier", EtatTuile.inondee, TypeTuile.tuileTresor);
        tableauTuile[4][0] = new Tuile(null, null, null);
        tableauTuile[4][1] = new Tuile("templeDuSoleil", EtatTuile.seche, TypeTuile.tuileTresor);
        tableauTuile[4][2] = new Tuile("templeDeLaLune", EtatTuile.coulee, TypeTuile.tuileTresor);
        tableauTuile[4][3] = new Tuile("palaisDesMarees", EtatTuile.seche, TypeTuile.tuileTresor);
        tableauTuile[4][4] = new Tuile("valDuCrepuscule", EtatTuile.seche, TypeTuile.tuileClassique);
        tableauTuile[4][5] = new Tuile(null, null, null);
        tableauTuile[5][0] = new Tuile(null, null, null);
        tableauTuile[5][1] = new Tuile(null, null, null);
        tableauTuile[5][2] = new Tuile("tourDuGuet", EtatTuile.seche, TypeTuile.tuileClassique);
        tableauTuile[5][3] = new Tuile("jardinDesMurmures", EtatTuile.inondee, TypeTuile.tuileTresor);
        tableauTuile[5][4] = new Tuile(null, null, null);
        tableauTuile[5][5] = new Tuile(null, null, null);
    }
    
    public Tuile getTuile(String nomTuile) {
        Tuile res = null;
        for (int i = 0; i < tableauTuile.length; i++) {
            for (int j = 0; i < tableauTuile.length; j++) {
                if (tableauTuile[i][j].getNomTuile() == nomTuile) {
                    res = tableauTuile[i][j];
                }
            }
        }
        return res;
    }
    
    public int getITuile(Tuile tuile) {
        int res = 0;
        for (int i = 0; i < tableauTuile.length; i++) {
            for (int j = 0; i < tableauTuile.length; j++) {
                if (tableauTuile[i][j] == tuile) {
                    res = i;
                }
            }
        }
        return res;
    }
    
    public int getJTuile(Tuile tuile) {
        int res = 0;
        for (int i = 0; i < tableauTuile.length; i++) {
            for (int j = 0; i < tableauTuile.length; j++) {
                if (tableauTuile[i][j] == tuile) {
                    res = j;
                }
            }
        }
        return res;
    }
    
}
