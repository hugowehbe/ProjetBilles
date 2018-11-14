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
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
        Collisions.collisionBilleContourPasseMuraille(this.getBilleDecore().getPosition(), abscisseCoinHautGauche,
                ordonnéeCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        this.getBilleDecore().gestionAccélération(billes);

    }

}