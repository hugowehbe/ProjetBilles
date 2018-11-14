package decorateur;

import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;

/**
 *
 * Bille traversant les murs
 *
 *
 *
 */
public class BillePasseMuraille extends DecorateurBille {

    public BillePasseMuraille(Bille billeDecore) {
        super(billeDecore);

    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
        Collisions.collisionBilleContourPasseMuraille(this.getBilleDecore().getPosition(), abscisseCoinHautGauche,
                ordonn�eCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAcc�l�ration(Vector<Bille> billes) {
        this.getBilleDecore().gestionAcc�l�ration(billes);

    }

}