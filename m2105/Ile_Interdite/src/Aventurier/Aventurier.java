/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aventurier;

import Grille.*;
import java.util.Scanner;

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

    private boolean droite, gauche, bas, haut, nulpart;
    private String info;

    public Aventurier(String nom, int numTourDeJeux, Tuile caseDepart) {
        this.nom = nom;
        this.numTourDeJeux = numTourDeJeux;
        this.caseDepart = caseDepart;
        this.posI = grille.getITuile(caseDepart);
        this.posJ = grille.getJTuile(caseDepart);
        this.PA = 3;
        grille.setGrille();
    }

    public void setPosI(int i) {
        this.posI = i;
    }

    public void setPosJ(int i) {
        this.posJ = i;
    }

    public int getPosI() {
        this.posI = grille.getITuile(caseDepart);
        return posI;
    }

    public int getPosJ() {
        this.posJ = grille.getJTuile(caseDepart);
        return posJ;
    }

    public boolean verifAssechable() {
        boolean droite = false, gauche = false, bas = false, haut = false, nulpart = true;

        // les verifications
        System.out.println("\nvous pouvez assecher les cases...\n");
        if (grille.getTuile(posI, posJ).getEtatTuile(posI, posJ + 1) == EtatTuile.INONDEE) {
            System.out.println("\nvous pouvez assecher la case a droite\n");
            droite = true;
            nulpart = false;

        }
        if (grille.getTuile(posI, posJ).getEtatTuile(posI, posJ - 1) == EtatTuile.INONDEE) {
            System.out.println("\nvous pouvez assecher la case a gauche\n");
            gauche = true;
            nulpart = false;

        }
        if (grille.getTuile(posI, posJ).getEtatTuile(posI - 1, posJ) == EtatTuile.INONDEE) {
            System.out.println("\n vous pouvez assecher la case du haut");
            haut = true;
            nulpart = false;
        }
        if (grille.getTuile(posI, posJ).getEtatTuile(posI + 1, posJ) == EtatTuile.INONDEE) {
            System.out.println("\n vous pouvez assecher la case du bas");
            bas = true;
            nulpart = false;
        }
        if (nulpart) {
            System.out.println("Vous ne pouvez rien assecher dans les alentours");
        }
        return nulpart;
    }

    public void assecher() {
        if (!verifAssechable()) {

            //je part de l'optique qu'il a encore des PA car c'est au tour de jeux d'y regarder
            // je demande a l'utilisateur de choisir son action du moi si c'est possible
            if (!nulpart) {
                Scanner choix = new Scanner(System.in);
                System.out.println("Veuillez choisir quelle case voulez vous assechez parmi :\n");

                do {
                    if (droite) {
                        System.out.println("-droite");
                        grille.getTuile(posI, posJ).setEtatTuile(EtatTuile.SECHE);
                    }
                    if (gauche) {
                        System.out.println("-gauche");
                        grille.getTuile(posI, posJ).setEtatTuile(EtatTuile.SECHE);
                    }
                    if (haut) {
                        System.out.println("-en haut");
                        grille.getTuile(posI, posJ).setEtatTuile(EtatTuile.SECHE);
                    }
                    if (bas) {
                        System.out.println("-en bas\n");

                        grille.getTuile(posI, posJ).setEtatTuile(EtatTuile.SECHE);
                    }
                    System.out.println("-pas bouger\n");
                    System.out.println("CHOISIS !");
                    info = choix.nextLine();
                } while (info != "droite" || info != "gauche" || info != "haut" || info != "bas" || info != "pas bouger");
            }

        }
    }
}
