/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aventurier;

import Grille.EtatTuile;
import Grille.Grille;
import Grille.Tuile;
import java.util.Scanner;

/**
 *
 * @author clinb
 */
public class Plongeur extends Aventurier {

    private int posI;
    private int posJ;
    private int PA;
    private Grille grille;
    private boolean haut, bas, droite, gauche, nulpart;
    private boolean plonger;

    public Plongeur(String nom, int numTourDeJeux, Tuile caseDepart) {
        super(nom, numTourDeJeux, caseDepart);
    }

    @Override
    public void deplacementPossible() {

        droite = false;
        gauche = false;
        haut = false;
        bas = false;
        nulpart = true;

        System.out.println("Vous pouvez vous déplacer ...");

        if (grille.getTuile(posI, posJ+1).getEtatTuile() != null) {  //Etat tuile droite adjacente
            droite = true;
            System.out.println("à droite");
            nulpart = false;
        }
        if (grille.getTuile(posI, posJ-1).getEtatTuile() != null) {  //Etat tuile gauche adjacente
            gauche = true;
            System.out.println("à gauche");
            nulpart = false;
        }
        if (grille.getTuile(posI-1, posJ).getEtatTuile() != null) {  //Etat tuile haut adjacente
            haut = true;
            System.out.println("en haut");
            nulpart = false;
        }
        if (grille.getTuile(posI+1, posJ).getEtatTuile() != null) {  //Etat tuile bas adjacente
            bas = true;
            System.out.println("en bas");
            nulpart = false;
        }
        if (nulpart) {
            System.out.println("nul part");
        }
    }

    @Override
    public void deplacement() {
        deplacementPossible();
        if (PA > 0 && !nulpart) {
            plonger = true;
            while (plonger = true) {

                Scanner choix = new Scanner(System.in);
                System.out.println("Choisissez la direction de déplacement (ou a pour s'arrêter): ");
                System.out.println("d, g, h, b");
                String direction = choix.nextLine();
                if (direction == "d" && droite) {
                    posJ = posJ + 1;
                    if ((grille.getTuile(posI, posJ).getEtatTuile() != EtatTuile.INONDEE) || (grille.getTuile(posI, posJ).getEtatTuile() !=EtatTuile.COULEE)) {
                        plonger = false;
                    }
                }else if (direction == "g" && gauche) {
                    posJ = posJ - 1;
                    if ((grille.getTuile(posI, posJ).getEtatTuile() != EtatTuile.INONDEE) || (grille.getTuile(posI, posJ).getEtatTuile() !=EtatTuile.COULEE)) {
                        plonger = false;
                    }
                }else if (direction == "h" && haut) {
                    posI = posI - 1;
                    if ((grille.getTuile(posI, posJ).getEtatTuile() != EtatTuile.INONDEE) || (grille.getTuile(posI, posJ).getEtatTuile() !=EtatTuile.COULEE)) {
                        plonger = false;
                    }
                }else if (direction == "b" && bas) {
                    posI = posI + 1;
                    if ((grille.getTuile(posI, posJ).getEtatTuile() != EtatTuile.INONDEE) || (grille.getTuile(posI, posJ).getEtatTuile() !=EtatTuile.COULEE)) {
                        plonger = false;
                    }
                }else if (direction == "a" && grille.getTuile(posI, posJ).getEtatTuile() != EtatTuile.COULEE){
                    plonger = false;
                }    
            }
            
            PA = PA - 1;
        }

    }
}
