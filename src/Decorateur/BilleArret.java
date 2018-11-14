package Decorateur;

import java.awt.Color;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import exodecorateur_angryballs.maladroit.modele.OutilsBille;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;
import mesmaths.mecanique.MecaniquePoint;

public class BilleArret extends DecorateurBille {

	public BilleArret(Bille billeDecore) {
		super(billeDecore);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
			double hauteur) {
		Collisions.collisionBilleContourAvecArretHorizontal(this.getBilleDecore().getPosition(), this.getBilleDecore().getRayon(), this.getBilleDecore().getVitesse(), abscisseCoinHautGauche, largeur);
		Collisions.collisionBilleContourAvecArretVertical(this.getBilleDecore().getPosition(), this.getBilleDecore().getRayon(), this.getBilleDecore().getVitesse(), ordonnéeCoinHautGauche, hauteur);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		// TODO Auto-generated method stub
		this.getBilleDecore().gestionAccélération(billes);
	}

}
