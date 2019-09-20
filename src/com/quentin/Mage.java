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

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur Mage
     * Boule de feu ou Soin
     *
     * @param choix choix de l'action
     * @see Rodeur#jouer(int)
     * @see Joueur#jouer(int)
     * @see Guerrier#jouer(int)
     * @return phrase de l'action
     */
    @Override
    protected String jouer(int choix) {
        String phrase = "";
        switch (choix) {
            case 1:
                adversaire.supprVie(intelligence);
                phrase = phrase + nom + " utilise boule de feu et inflige " + intelligence + " de dégâts";
                break;
            case 2:
                //Soin
                phrase = phrase + nom + " utilise Soin et gagne ";
                if ((intelligence * 2) + vie > santeMax) {
                    phrase = phrase + (santeMax - vie) + " de vitalité";
                    vie = santeMax;
                } else {
                    phrase = phrase + (intelligence * 2) + " de vitalité";
                    vie = vie + (intelligence * 2);
                }
                break;
            default:
                break;
        }
        return phrase;
    }
}
