package decorateur;

import java.util.Vector;

import modele.Bille;
import modele.OutilsBille;

public class BilleMvtNewton extends DecorateurBille {

    public BilleMvtNewton(Bille billeDecore) {
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
        this.getBilleDecore().getAcc�l�ration().ajoute(OutilsBille.gestionAcc�l�rationNewton(this.getBilleDecore(), billes));
    }

}