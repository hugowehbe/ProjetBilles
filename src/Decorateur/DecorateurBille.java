package Decorateur;

import java.awt.Color;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import mesmaths.geometrie.base.Vecteur;

public abstract class DecorateurBille extends Bille{

	private Bille billeDecore;
	
	public DecorateurBille(Bille billeDecore) {
		this.setBilleDecore(billeDecore);
		// TODO Auto-generated constructor stub
	}

	public Bille getBilleDecore() {
		return billeDecore;
	}

	public void setBilleDecore(Bille billeDecore) {
		this.billeDecore = billeDecore;
	}

	public abstract void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur, double hauteur);

	public void gestionAcc�l�ration(Vector<Bille> billes){
		super.gestionAcc�l�ration(billes);
	}
}
