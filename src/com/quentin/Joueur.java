package com.quentin;

/**
 * classe Joueur
 *
 * @author Q-Jei
 * @version 1.0
 */

public abstract class Joueur {

    protected String cri;
    protected String type;
    protected String nom;
    protected int niveau;
    protected int vie;
    protected int force;
    protected int agilite;
    protected int intelligence;

    /**
     * Constructeur de Joueur
     *
     * @param idJoueur le numéro du joueur
     * @param force le force du joueur
     * @param agilite l'agilité du joueur
     * @param intelligence l'intelligence du joueur
     */
    Joueur(int idJoueur, int force, int agilite, int intelligence) {
        nom = "Joueur " + idJoueur;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        niveau = force + agilite + intelligence;
        vie = niveau * 5;
    }

}
