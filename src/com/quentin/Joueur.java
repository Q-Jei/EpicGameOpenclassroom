package com.quentin;

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
     * @param numJoueur le numéro du joueur
     * @param force le force du joueur
     * @param agilite l'agilité du joueur
     * @param intelligence l'intelligence du joueur
     */
    Joueur(int numJoueur, int force, int agilite, int intelligence) {
        nom = "Joueur " + numJoueur;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        niveau = force + agilite + intelligence;
        vie = niveau * 5;
    }

}
