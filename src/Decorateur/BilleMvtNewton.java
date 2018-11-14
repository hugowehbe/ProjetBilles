package Decorateur;

import java.awt.Color;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import exodecorateur_angryballs.maladroit.modele.OutilsBille;
import mesmaths.geometrie.base.Vecteur;

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
		this.getAcc�l�ration().ajoute(OutilsBille.gestionAcc�l�rationNewton(this.getBilleDecore(), billes));
	}

}
