package modele.decorateur;

import java.util.Vector;

import modele.Bille;
import mesmaths.geometrie.base.Vecteur;

public class BilleMvtPesanteur extends DecorateurBille {

    Vecteur pesanteur;

    public BilleMvtPesanteur(Vecteur pesanteur, Bille billeDecore) {
        super(billeDecore);
        this.pesanteur=pesanteur;
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        this.getBilleDecore().gestionAccélération(billes);
        this.getAccélération().ajoute(this.pesanteur);
    }

}