package decorateur;

import java.util.Vector;

import modele.Bille;
import mesmaths.mecanique.MecaniquePoint;

public class BilleFrottement extends DecorateurBille {

    public BilleFrottement(Bille billeDecore) {
        super(billeDecore);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAcc�l�ration(Vector<Bille> billes) {
        // TODO Auto-generated method stub
        this.getBilleDecore().gestionAcc�l�ration(billes);
        this.getBilleDecore().getAcc�l�ration().ajoute(MecaniquePoint.freinageFrottement(this.getBilleDecore().masse(), this.getBilleDecore().getVitesse()));
    }

}