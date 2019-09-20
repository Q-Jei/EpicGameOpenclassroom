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
    protected Joueur adversaire;


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

    /**
     * Début du tour du joueur. On vérifie également qu'il a encore de la vie pour jouer sinon le jeu s'arrête
     */
    public void activeJoueur() {
        int choix;
        if (vie > 0) {
            do {
                choix = Main.demande(nom + " (" + vie + " vitalité), veuillez choisir votre action (1 : attaque basique, 2 : attaque spéciale)", 1, 2);
                if (choix != 1 && choix != 2) System.out.println("Entrez une valeur correcte !");
            } while (choix != 1 && choix != 2);

            System.out.println(this.jouer(choix));
            if (vie <= 0) return;
            this.adversaire.activeJoueur();
        } else {
            System.out.println("Le " + nom + " à perdu !");
        }
    }

    /**
     * Pour enlever des points de vie à l'adversaire
     * @param pointsASuppr le nombre de points de vie à supprimer à l'adversaire
     */
    protected void supprVie(int pointsASuppr) {
        vie = vie - pointsASuppr;
    }

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur
     *
     * @param choix le choix de l'action
     * @see Mage#jouer(int)
     * @see Guerrier#jouer(int)
     * @see Rodeur#jouer(int)
     * @return le résultat de l'attaque
     */
    protected abstract String jouer(int choix);

    /**
     * Désigne l'adversaire du joueur
     * @param adversaire le joueur à désigner comme adversaire
     */
    public void setAdversaire(Joueur adversaire) {
        this.adversaire = adversaire;
    }

    /**
     * Retourne la description du joueur
     * @return la phrase de description
     */
    public String toString() {
        return cri + " ! Je suis le " + type + ", " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence.";
    }

}
