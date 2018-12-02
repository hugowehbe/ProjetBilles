package modele.decorateur;

import java.awt.Color;
import java.util.Vector;

import modele.Bille;
import mesmaths.geometrie.base.Vecteur;
import visitor.VisitorBille;

public abstract class DecorateurBille extends Bille {

    private Bille billeDecore;

    public DecorateurBille(Bille billeDecore) {
        this.setBilleDecore(billeDecore);
    }

    public Bille getBilleDecore() {
        return billeDecore;
    }

    public void setBilleDecore(Bille billeDecore) {
        this.billeDecore = billeDecore;
    }

    public abstract void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur, double hauteur);

    public void gestionAccélération(Vector<Bille> billes) {
        billeDecore.gestionAccélération(billes);
    }


    /**
     * @return the position
     */
    public Vecteur getPosition() {
        return billeDecore.getPosition();
    }


    /**
     * @return the rayon
     */
    public double getRayon() {
        return billeDecore.getRayon();
    }


    /**
     * @return the vitesse
     */
    public Vecteur getVitesse() {
        return billeDecore.getVitesse();
    }


    /**
     * @return the accélération
     */
    public Vecteur getAccélération() {
        return billeDecore.getAccélération();
    }


    /**
     * @return the clef
     */
    public int getClef() {
        return billeDecore.getClef();
    }


    /**
     * @return the couleur
     */
    public Color getCouleur() {
        return billeDecore.getCouleur();
    }


    public void dessine(VisitorBille v) {
        v.visite(this);
    }


}