package Decorateur;

import java.awt.Color;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;

/**
 * 
 * Bille rebondissant sur les murs
 * 
 * 
 * 
 */
public class BilleRebond extends DecorateurBille {

	public BilleRebond(Bille billeDecore) {
		super(billeDecore);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
			double hauteur) {
		this.getBilleDecore().collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
		Collisions.collisionBilleContourAvecRebond(this.getBilleDecore().getPosition(),
				this.getBilleDecore().getRayon(), this.getBilleDecore().getVitesse(), abscisseCoinHautGauche,
				ordonnéeCoinHautGauche, largeur, hauteur);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		this.getBilleDecore().gestionAccélération(billes);

	}

}
