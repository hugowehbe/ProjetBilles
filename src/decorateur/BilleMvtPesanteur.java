package decorateur;

import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import mesmaths.geometrie.base.Vecteur;

public class BilleMvtPesanteur extends DecorateurBille {

    Vecteur pesanteur;

    public BilleMvtPesanteur(Vecteur pesanteur, Bille billeDecore) {
        super(billeDecore);
        this.pesanteur=pesanteur;
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
        this.getAcc�l�ration().ajoute(this.pesanteur);
    }

}