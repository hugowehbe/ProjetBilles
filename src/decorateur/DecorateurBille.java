package decorateur;

import java.awt.Color;
import java.util.Vector;

import modele.Bille;
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
        billeDecore.gestionAcc�l�ration(billes);
    }


    /**
     * @return the position
     */
    public Vecteur getPosition()
    {
        return billeDecore.getPosition();
    }




    /**
     * @return the rayon
     */
    public double getRayon()
    {
        return billeDecore.getRayon();
    }




    /**
     * @return the vitesse
     */
    public Vecteur getVitesse()
    {
        return billeDecore.getVitesse();
    }




    /**
     * @return the acc�l�ration
     */
    public Vecteur getAcc�l�ration()
    {
        return billeDecore.getAcc�l�ration();
    }




    /**
     * @return the clef
     */
    public int getClef()
    {
        return billeDecore.getClef();
    }



    /**
     * @return the couleur
     */
    public Color getCouleur()
    {
        return billeDecore.getCouleur();
    }





}