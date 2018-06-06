/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Aventurier.*;
import Grille.*;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author clinb
 */
public class Controleur {
    private ArrayList<Aventurier> joueurs = new ArrayList<>();
    private static int nbJoueurs;
    private static Grille grille;
    private Plongeur plongeur;
    private 
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        grille.setGrille();
        nbJoueurs = 0;
        
        Scanner choix = new Scanner(System.in);
        while ((nbJoueurs < 2)||(nbJoueurs > 4)) {
            System.out.print("Choisissez le nombre de joueurs (entre 2 et 4) : ");
            nbJoueurs = choix.nextInt();
        }
    }
    
    public void choixAction(Action action) {
        
    }
    
    public void choixAventurier(String choix) {
        for (int i = 1; i <= nbJoueurs; i++) {
            System.out.println("Choix de l'aventurier du joueur " + i);
            System.out.println("\tChoix disponibles :");
            System.out.println("\t\tPlongeur");
            System.out.println("\t\tNavigateur");
            System.out.println("\t\tExplorateur");
            System.out.println("\t\tPilote");
            System.out.println("\t\tMessager");
            System.out.println("\t\tIngenieur");
            if (choix.equalsIgnoreCase("plongeur") && joueurs.contains(plongeur)) {
                plongeur = new Plongeur("plongeur", i, grille.getTuile("porteDeFer"));
                joueurs.add(plongeur);
            }
            if (choix.equalsIgnoreCase("plongeur")) {
                Plongeur plongeur = new Plongeur("plongeur", i, grille.getTuile("porteDeFer"));
            }
        }
    } 
}
