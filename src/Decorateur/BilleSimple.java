package Decorateur;

import java.awt.Color;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import mesmaths.geometrie.base.Vecteur;

public class BilleSimple extends Bille {

	public BilleSimple(Vecteur position, double rayon, Vecteur vitesse, Color couleur) {
		this(position, rayon, vitesse, new Vecteur(), couleur);
		// TODO Auto-generated constructor stub
	}

	protected BilleSimple(Vecteur centre, double rayon, Vecteur vitesse, Vecteur accélération, Color couleur) {
		this.position = centre;
		this.rayon = rayon;
		this.vitesse = vitesse;
		this.accélération = accélération;
		this.couleur = couleur;
		this.clef = Bille.prochaineClef++;
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
			double hauteur) {
	}
	
	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		// TODO Auto-generated method stub
		super.gestionAccélération(billes);                              // remise à zéro du vecteur accélération
	}
}
