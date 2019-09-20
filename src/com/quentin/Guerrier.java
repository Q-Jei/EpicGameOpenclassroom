package com.quentin;

/**
 * Classe des joueurs de type Guerrier
 *
 * @author Q-Jei
 * @version 1.0
 */

public class Guerrier extends Joueur {

    /**
     * Constructeur de Joueur
     *
     * @param idJoueur    le numéro du joueur
     * @param force        le force du joueur
     * @param agilite      l'agilité du joueur
     * @param intelligence l'intelligence du joueur
     */
    protected Guerrier(int idJoueur, int force, int agilite, int intelligence) {
        super(idJoueur, force, agilite, intelligence);
        type = "Guerrier";
        cri = "Woarg";
    }


}
