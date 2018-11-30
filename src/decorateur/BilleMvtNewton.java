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
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        // TODO Auto-generated method stub
        this.getBilleDecore().gestionAccélération(billes);
        this.getBilleDecore().getAccélération().ajoute(OutilsBille.gestionAccélérationNewton(this.getBilleDecore(), billes));
    }

}