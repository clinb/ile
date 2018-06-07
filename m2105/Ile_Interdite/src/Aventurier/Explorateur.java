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
public class Explorateur extends Aventurier {
    
    private int posI;
    private int posJ;
    private int PA;
    private Grille grille;
    private boolean haut, bas, droite, gauche, nulpart;
    private boolean hautgauche, hautdroite, basdroite, basgauche;
    
     public Explorateur(String nom, int numTourDeJeux, Tuile caseDepart) {
        super(nom, numTourDeJeux, caseDepart);
      
    }
    
    @Override
    public void deplacementPossible(){
        
        droite = false;
        gauche = false;
        haut = false;
        bas = false;
        nulpart = true;
        hautgauche = false;
        hautdroite = false;
        basgauche = false;
        basdroite = false;
        
        System.out.println("Vous pouvez vous déplacer ...");
        
        if(grille.getTuile(posI, posJ+1).getEtatTuile()!= EtatTuile.COULEE){  //Etat tuile droite adjacente
            droite = true;
            System.out.println("à droite");
            nulpart = false;
        }
        if(grille.getTuile(posI, posJ-1).getEtatTuile()!= EtatTuile.COULEE){  //Etat tuile gauche adjacente
            gauche = true;
            System.out.println("à gauche");
            nulpart = false;
        }
        if(grille.getTuile(posI-1, posJ).getEtatTuile()!= EtatTuile.COULEE){  //Etat tuile haut adjacente
            haut = true; 
            System.out.println("en haut");
            nulpart = false;
        }
        if(grille.getTuile(posI+1, posJ).getEtatTuile()!= EtatTuile.COULEE){  //Etat tuile bas adjacente
            bas = true; 
            System.out.println("en bas");
            nulpart = false;
        }
        if(grille.getTuile(posI-1, posJ+1).getEtatTuile()!= EtatTuile.COULEE){  //Etat tuile haut-droite diagonale
            hautdroite = true;
            System.out.println("en digonale haut-droite");
            nulpart = false;
        }
        if(grille.getTuile(posI-1, posJ-1).getEtatTuile()!= EtatTuile.COULEE){  //Etat tuile haut-gauche diagonale
            hautgauche = true;
            System.out.println("en diagonale haut-gauche");
            nulpart = false;
        }
        if(grille.getTuile(posI+1, posJ+1).getEtatTuile()!= EtatTuile.COULEE){   //Etat tuile bas-droite diagonale
            basdroite = true; 
            System.out.println("en diagonale bas-droite");
            nulpart = false;
        }
        if(grille.getTuile(posI+1, posJ-1).getEtatTuile()!= EtatTuile.COULEE){     //Etat tuile bas-gauche diagonale
            basgauche = true; 
            System.out.println("en diagonale bas-gauche");
            nulpart = false;
        }
        if (nulpart){
            System.out.println("nul part");
        }
    }
        
    @Override
    public void deplacement(){
        deplacementPossible();
        if(PA>0 && !nulpart){
            Scanner choix = new Scanner(System.in);
            System.out.println("Choisissez la direction de déplacement : ");
            System.out.println("d, g, h, b, hd, hg, bd, bg");
            String direction = choix.nextLine();
            if(direction == "d" && droite){
                posJ = posJ+1;
            }
            if(direction == "g" && gauche){
                posJ = posJ-1;
            }
            if(direction == "h" && haut){
                posI = posI-1;
            }
            if(direction == "b" && bas){
                posI = posI+1;
            }
            if(direction == "hd" && hautdroite){
                posI = posI-1;
                posJ = posJ+1;
            }
            if(direction == "hg" && hautgauche){
                posI = posI-1;
                posJ = posJ-1;
            }
            if(direction == "bd" && basdroite){
                posI = posI+1;
                posJ = posJ+1;
            }
            if(direction == "bg" && basgauche){
                posI = posI+1;
                posJ = posJ-1;
            }
            
            PA = PA - 1;
        }
    }
    @Override
    public void verifAssecher(){
        droite = false;
        gauche = false;
        haut = false;
        bas = false;
        nulpart = true;
        hautgauche = false;
        hautdroite = false;
        basgauche = false;
        basdroite = false;
        
        System.out.println("Vous pouvez vous assecher les cases en tant qu'Explorateur\n:");
        
        if(grille.getTuile(posI, posJ+1).getEtatTuile()== EtatTuile.INONDEE){  //Etat tuile droite adjacente
            droite = true;
            System.out.println("-à droite");
            nulpart = false;
        }
        if(grille.getTuile(posI, posJ-1).getEtatTuile()== EtatTuile.INONDEE){  //Etat tuile gauche adjacente
            gauche = true;
            System.out.println("-à gauche");
            nulpart = false;
        }
        if(grille.getTuile(posI-1, posJ).getEtatTuile()== EtatTuile.INONDEE){  //Etat tuile haut adjacente
            haut = true; 
            System.out.println("-en haut");
            nulpart = false;
        }
        if(grille.getTuile(posI+1, posJ).getEtatTuile()== EtatTuile.INONDEE){  //Etat tuile bas adjacente
            bas = true; 
            System.out.println("-en bas");
            nulpart = false;
        }
        //assechement acquitement pour l'explorateur
        if(grille.getTuile(posI-1, posJ+1).getEtatTuile()== EtatTuile.INONDEE){  //Etat tuile haut-droite diagonale
            hautdroite = true;
            System.out.println("-en digonale haut-droite");
            nulpart = false;
        }
        if(grille.getTuile(posI-1, posJ-1).getEtatTuile()== EtatTuile.INONDEE){  //Etat tuile haut-gauche diagonale
            hautgauche = true;
            System.out.println("-en diagonale haut-gauche");
            nulpart = false;
        }
        if(grille.getTuile(posI+1, posJ+1).getEtatTuile()== EtatTuile.INONDEE){   //Etat tuile bas-droite diagonale
            basdroite = true; 
            System.out.println("-en diagonale bas-droite");
            nulpart = false;
        }
        if(grille.getTuile(posI+1, posJ-1).getEtatTuile()== EtatTuile.INONDEE){     //Etat tuile bas-gauche diagonale
            basgauche = true; 
            System.out.println("-en diagonale bas-gauche");
            nulpart = false;
        }
        if (nulpart){
            System.out.println("-nul part");
        }
    }
    @Override
    public void assecher(){
        verifAssecher();
        //je part de l'optique qu'il a encore des PA car c'est au tour de jeux d'y regarder
        // je demande a l'utilisateur de choisir son action du moi si c'est possible
        if (!nulpart) {
            Scanner choix = new Scanner(System.in);
            System.out.println("Veuillez choisir quelle case voulez vous assechez parmi :\n");

            do {
                if (droite) {
                    System.out.println("-droite");
                    grille.getTuile(posI, posJ +1).setEtatTuile(EtatTuile.SECHE);
                }
                if (gauche) {
                    System.out.println("-gauche");
                    grille.getTuile(posI, posJ - 1).setEtatTuile(EtatTuile.SECHE);
                }
                if (haut) {
                    System.out.println("-en haut");
                    grille.getTuile(posI + 1, posJ).setEtatTuile(EtatTuile.SECHE);
                }
                if (bas) {
                    System.out.println("-en bas\n");

                    grille.getTuile(posI -1, posJ).setEtatTuile(EtatTuile.SECHE);
                }
               
                // partie special lier au deplacemetnt de l'exporateur
                if (hautgauche) {
                    System.out.println("-en hautGauche\n");

                    grille.getTuile(posI -1, posJ -1).setEtatTuile(EtatTuile.SECHE);
                }
                if (hautdroite) {
                    System.out.println("-en hautDroit\n");

                    grille.getTuile(posI -1, posJ+1).setEtatTuile(EtatTuile.SECHE);
                }
                if (basdroite) {
                    System.out.println("-en basDroit\n");

                    grille.getTuile(posI -1, posJ+1).setEtatTuile(EtatTuile.SECHE);
                }
                if (basgauche) {
                    System.out.println("-en basGauche\n");
                    grille.getTuile(posI -1, posJ-1).setEtatTuile(EtatTuile.SECHE);
                }
                
                
                System.out.println("-pas bouger\n");
                System.out.println("CHOISIS !");
                choix.nextLine();
            } while (choix.nextLine().equalsIgnoreCase("droite") || choix.nextLine().equalsIgnoreCase("gauche") 
                        || choix.nextLine().equalsIgnoreCase("haut") || choix.nextLine().equalsIgnoreCase("bas") || 
                    choix.nextLine().equalsIgnoreCase("hautgauche") ||choix.nextLine().equalsIgnoreCase("hautdroit") ||
                    choix.nextLine().equalsIgnoreCase("basgauche") ||choix.nextLine().equalsIgnoreCase("basdroit") ||
                    choix.nextLine().equalsIgnoreCase("pas bouger"));
        }
    }
    
}
