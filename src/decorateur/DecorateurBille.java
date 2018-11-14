package decorateur;

import exodecorateur_angryballs.maladroit.modele.Bille;

import java.util.Vector;

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

    public abstract void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur, double hauteur);

    public void gestionAccélération(Vector<Bille> billes){
        super.gestionAccélération(billes);
    }
}
