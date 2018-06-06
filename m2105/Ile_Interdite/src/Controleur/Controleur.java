/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Aventurier.Action;
import Aventurier.Aventurier;
import Aventurier.Explorateur;
import Aventurier.Ingenieur;
import Aventurier.Messager;
import Aventurier.Navigateur;
import Aventurier.Pilote;
import Aventurier.Plongeur;
import Grille.Grille;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clinb
 */
public class Controleur {

    private ArrayList<Aventurier> joueurs = new ArrayList<>();
    private static int nbJoueurs;
    private static Grille grille = new Grille();
    private Plongeur plongeur;
    private Pilote pilote;
    private Navigateur navigateur;
    private Messager messager;
    private Ingenieur ingenieur;
    private Explorateur explorateur;
    private String choixAventurier;

    public void choixAction(Action action) {

    }

    public void init() {
        nbJoueurs = 0;

        Scanner choix = new Scanner(System.in);
        Scanner choix2 = new Scanner(System.in);

        while ((nbJoueurs < 2) || (nbJoueurs > 4)) {
            System.out.print("Choisissez le nombre de joueurs (entre 2 et 4) : ");
            nbJoueurs = choix2.nextInt();
        }
        grille.setGrille();
        for (int i = 1; i <= nbJoueurs; i++) {
            boolean selec = false;
            while (selec == false) {
                System.out.println("Choix de l'aventurier du joueur " + i);
                System.out.println("\tChoix disponibles :");
                if (!joueurs.contains(messager)) {
                    System.out.println("\t\tMessager");
                }
                if (!joueurs.contains(plongeur)) {
                    System.out.println("\t\tPlongeur");
                }
                if (!joueurs.contains(navigateur)) {
                    System.out.println("\t\tNavigateur");
                }
                if (!joueurs.contains(pilote)) {
                    System.out.println("\t\tPilote");
                }
                if (!joueurs.contains(ingenieur)) {
                    System.out.println("\t\tIngenieur");
                }
                if (!joueurs.contains(explorateur)) {
                    System.out.println("\t\tExplorateur");
                }
                
                choixAventurier = choix.nextLine();
                if (choixAventurier.equalsIgnoreCase("plongeur") && !joueurs.contains(plongeur)) {
                    plongeur = new Plongeur("plongeur", i, grille.getTuile("porteDeFer"));
                    joueurs.add(plongeur);
                    System.out.println("\n\tJoueur enregistré");
                    selec = true;
                } else if (choixAventurier.equalsIgnoreCase("messager") && !joueurs.contains(messager)) {
                    messager = new Messager("messager", i, grille.getTuile("porteDArgent"));
                    joueurs.add(messager);
                    System.out.println("\n\tJoueur enregistré");
                    selec = true;
                } else if (choixAventurier.equalsIgnoreCase("pilote") && !joueurs.contains(pilote)) {
                    pilote = new Pilote("pilote", i, grille.getTuile("heliport"));
                    joueurs.add(pilote);
                    System.out.println("\n\tJoueur enregistré");
                    selec = true;
                } else if (choixAventurier.equalsIgnoreCase("navigateur") && !joueurs.contains(navigateur)) {
                    navigateur = new Navigateur("navigateur", i, grille.getTuile("porteDOr"));
                    joueurs.add(navigateur);
                    System.out.println("\n\tJoueur enregistré");
                    selec = true;
                } else if (choixAventurier.equalsIgnoreCase("explorateur") && !joueurs.contains(explorateur)) {
                    explorateur = new Explorateur("explorateur", i, grille.getTuile("porteDeCuivre"));
                    joueurs.add(explorateur);
                    System.out.println("\n\tJoueur enregistré");
                    selec = true;
                } else if (choixAventurier.equalsIgnoreCase("ingenieur") && !joueurs.contains(ingenieur)) {
                    ingenieur = new Ingenieur("ingenieur", i, grille.getTuile("porteDeBronze"));
                    joueurs.add(ingenieur);
                    System.out.println("\n\tJoueur enregistré");
                    selec = true;
                } else {
                    System.out.println("Nom mal tapé ou aventurier déjà enregistré");
                }
               
            }
            selec = false;
        }
        System.out.println("Tous les joueurs sont bien enregistrés");
    }
    
}
