package com.quentin;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * classe principale du jeu épique
 *
 * @author Q-Jei
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        int idJoueur = 1;
        Joueur joueur1 = creerJoueur(idJoueur); // Création du joueur 1
        System.out.println(joueur1.toString());
        idJoueur++;
        Joueur joueur2 = creerJoueur(idJoueur); // Création du joueur 2
        System.out.println(joueur2.toString());
        joueur1.setAdversaire(joueur2);
        joueur2.setAdversaire(joueur1);
        joueur1.activeJoueur(); // Début de la partie
    }

    /**
     * Retourne un joueur en le créant grace aux caractéristiques rentrés au clavier
     *
     * @param idJoueur le numéro du joueur
     * @return le personnage créé grace aux caractéristiques données par le joueur
     */
    private static Joueur creerJoueur(int idJoueur) {
        Joueur j;
        int type, niveau, force, agilite, intelligence;
        System.out.println("Création du personnage du Joueur " + idJoueur);
        type = demande("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)", 1, 3);
        do {
            niveau = demande("Niveau du personnage ?", 1);
            force = demande("Force du personnage ?", 0);
            agilite = demande("Agilité du personnage ?", 0);
            intelligence = demande("Intelligence du personnage ?", 0);
            if (force + agilite + intelligence != niveau) {
                System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
            }
        } while (force + agilite + intelligence != niveau);
        switch (type) {
            case 1:
                j = new Guerrier(idJoueur, force, agilite, intelligence);
                break;
            case 2:
                j = new Rodeur(idJoueur, force, agilite, intelligence);
                break;
            case 3:
                j = new Mage(idJoueur, force, agilite, intelligence);
                break;
            default:
                j = new Mage(idJoueur, force, agilite, intelligence);
                break;
        }
        return j;
    }

    /**
     * Effectue une demande et retourne la réponse numérique
     *
     * @param str la demande à faire
     * @param min la valeur minimale du choix
     * @return le choix fait par l'utilisateur
     */
    public static int demande(String str, int min) {
        int choix;
        boolean choixCorrect;
        Scanner sc = new Scanner(System.in);
        do {
            choix = 0;
            System.out.println(str);
            try {
                choixCorrect = true;
                choix = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                choixCorrect = false;
            }
            if (choixCorrect) {
                if (!(choix >= min)) choixCorrect = false;
            }
        } while (!choixCorrect);
        return choix;
    }

    /**
     * Effectue une demande et retourne la réponse
     *
     * @param str la demande à faire
     * @param min la valeur minimale du choix
     * @param max la valeur maximale du choix
     * @return le choix fait par l'utilisateur
     */
    public static int demande(String str, int min, int max) {
        int choix;
        do {
            choix = demande(str, min);
        } while (choix > max);
        return choix;
    }

}
