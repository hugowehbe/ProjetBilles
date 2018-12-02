package modele.decorateur;

import java.util.Vector;

import modele.Bille;
import mesmaths.mecanique.MecaniquePoint;

public class BilleFrottement extends DecorateurBille {

    public BilleFrottement(Bille billeDecore) {
        super(billeDecore);
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        this.getBilleDecore().gestionAccélération(billes);
        this.getBilleDecore().getAccélération().ajoute(MecaniquePoint.freinageFrottement(this.getBilleDecore().masse(), this.getBilleDecore().getVitesse()));
    }

}