package modele.decorateur;

import java.util.Vector;

import modele.Bille;
import modele.OutilsBille;

public class BilleMvtNewton extends DecorateurBille {

    public BilleMvtNewton(Bille billeDecore) {
        super(billeDecore);
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAcc�l�ration(Vector<Bille> billes) {
        this.getBilleDecore().gestionAcc�l�ration(billes);
        this.getBilleDecore().getAcc�l�ration().ajoute(OutilsBille.gestionAcc�l�rationNewton(this.getBilleDecore(), billes));
    }

}