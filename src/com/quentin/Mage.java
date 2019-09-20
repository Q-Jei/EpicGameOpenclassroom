package com.quentin;

/**
 * Classe des joueurs de type Mage
 *
 * @author Q-Jei
 * @version 1.0
 */

public class Mage extends Joueur {

    /**
     * Santé maximale du joueur mage donnée lors de la création du joueur
     */
    private int santeMax;

    /**
     * Constructeur du joueur mage
     *
     * @param idJoueur     le numéro du joueur
     * @param force        le force du joueur
     * @param agilite      l'agilité du joueur
     * @param intelligence l'intelligence du joueur
     */
    Mage(int idJoueur, int force, int agilite, int intelligence) {
        super(idJoueur, force, agilite, intelligence);
        santeMax = vie;
        type = "Mage";
        cri = "Abracadabra";
    }
}
