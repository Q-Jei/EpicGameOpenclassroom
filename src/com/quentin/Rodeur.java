package com.quentin;

/**
 * Classe des joueurs de type Rodeur
 *
 * @author Q-Jei
 * @version 1.0
 */

public class Rodeur extends Joueur {

    /**
     * Constructeur de Joueur
     *
     * @param idJoueur     le numéro du joueur
     * @param force        le force du joueur
     * @param agilite      l'agilité du joueur
     * @param intelligence l'intelligence du joueur
     */
    Rodeur(int idJoueur, int force, int agilite, int intelligence) {
        super(idJoueur, force, agilite, intelligence);
        type = "Rodeur";
        cri = "Fufufu";
    }
}
