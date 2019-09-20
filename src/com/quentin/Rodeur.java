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

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur Rôdeur
     * Tir à l'Arc ou Concentration
     *
     * @param choix
     *      choix de l'action
     * @see Mage#jouer(int)
     * @see Joueur#jouer(int)
     * @see Guerrier#jouer(int)
     * @return phrase de l'action
     */
    @Override
    protected String jouer(int choix) {
        String phrase = "";
        switch (choix) {
            case 1:
                adversaire.supprVie(agilite);
                phrase = phrase + nom + " utilise Tir à l'Arc et inflige " + agilite + " de dégâts";
                break;
            case 2:
                agilite = agilite + (niveau / 2);
                phrase = phrase + nom + " utilise Concentration et gagne " + (niveau / 2) + " d'agilité";
                break;
            default:
                break;
        }
        return phrase;
    }
}
