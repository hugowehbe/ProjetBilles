package decorateur;

import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import mesmaths.geometrie.base.Vecteur;
import mesmaths.mecanique.MecaniquePoint;

public class BilleFrottement extends DecorateurBille {

    public BilleFrottement(Bille billeDecore) {
        super(billeDecore);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        // TODO Auto-generated method stub
        this.getBilleDecore().gestionAccélération(billes);
        this.getAccélération().ajoute(MecaniquePoint.freinageFrottement(this.masse(), this.getVitesse()));
    }

}