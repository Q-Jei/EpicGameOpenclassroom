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

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur Guerrier
     * Coup d'épée ou Coup de rage
     *
     * @param choix
     *      choix de l'action
     * @see Mage#jouer(int)
     * @see Joueur#jouer(int)
     * @see Rodeur#jouer(int)
     * @return phrase de l'action
     */
    @Override
    protected String jouer(int choix) {
        String phrase = "";
        switch (choix) {
            case 1:
                adversaire.supprVie(force);
                phrase = phrase + nom + " utilise Coup d'épée et inflige " + force + " de dégâts";
                break;
            case 2:
                adversaire.supprVie(force * 2);
                vie = vie - force / 2;
                phrase = phrase + nom + " utilise Coup de rage, inflige " + (force * 2) + " de dégâts et perd " + (force / 2) + " de vitalité";
                break;
            default:
                break;
        }
        if (vie > 0) {
            return phrase;
        } else {
            return "Le " + nom + " n'a plus de vie, il a perdu !";
        }
    }
}
