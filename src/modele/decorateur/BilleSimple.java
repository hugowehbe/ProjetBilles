package modele.decorateur;

import java.awt.Color;
import java.util.Vector;

import modele.Bille;
import mesmaths.geometrie.base.Vecteur;
import visitor.VisitorBille;

public class BilleSimple extends Bille {

    public BilleSimple(Vecteur position, double rayon, Vecteur vitesse, Color couleur) {
        this(position, rayon, vitesse, new Vecteur(), couleur);
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
    public void dessine(VisitorBille v) {
        v.visite(this);
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        super.gestionAccélération(billes);                              // remise à zéro du vecteur accélération
    }
}