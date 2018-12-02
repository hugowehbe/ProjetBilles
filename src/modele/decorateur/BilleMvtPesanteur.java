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
    public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
                                 double hauteur) {
        this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
    }

    @Override
    public void gestionAcc�l�ration(Vector<Bille> billes) {
        this.getBilleDecore().gestionAcc�l�ration(billes);
        this.getAcc�l�ration().ajoute(this.pesanteur);
    }

}