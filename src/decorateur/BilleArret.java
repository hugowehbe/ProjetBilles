package decorateur;

import modele.Bille;
import mesmaths.cinematique.Collisions;

import java.util.Vector;

public class BilleArret extends DecorateurBille {

    public BilleArret(Bille billeDecore) {
        super(billeDecore);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
                                 double hauteur) {
        Collisions.collisionBilleContourAvecArretHorizontal(this.getBilleDecore().getPosition(), this.getBilleDecore().getRayon(), this.getBilleDecore().getVitesse(), abscisseCoinHautGauche, largeur);
        Collisions.collisionBilleContourAvecArretVertical(this.getBilleDecore().getPosition(), this.getBilleDecore().getRayon(), this.getBilleDecore().getVitesse(), ordonnéeCoinHautGauche, hauteur);
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        // TODO Auto-generated method stub
        this.getBilleDecore().gestionAccélération(billes);
    }

}