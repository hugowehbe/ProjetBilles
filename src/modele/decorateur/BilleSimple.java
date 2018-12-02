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

    protected BilleSimple(Vecteur centre, double rayon, Vecteur vitesse, Vecteur acc�l�ration, Color couleur) {
        this.position = centre;
        this.rayon = rayon;
        this.vitesse = vitesse;
        this.acc�l�ration = acc�l�ration;
        this.couleur = couleur;
        this.clef = Bille.prochaineClef++;
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
                                 double hauteur) {

    }

    @Override
    public void dessine(VisitorBille v) {
        v.visite(this);
    }

    @Override
    public void gestionAcc�l�ration(Vector<Bille> billes) {
        super.gestionAcc�l�ration(billes);                              // remise � z�ro du vecteur acc�l�ration
    }
}