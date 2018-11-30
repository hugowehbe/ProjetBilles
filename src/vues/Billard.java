package vues;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Vector;

import modele.Bille;
import visitor.Dessinateur;
import visitor.VisitorBille;

import javax.swing.*;


/**
 * responsable du dessin des billes
 *
 *  ICI : IL N'Y A RIEN A CHANGER 
 *
 *
 * */
public class Billard extends JPanel
{
    Vector<Bille> billes;
    VisitorBille visitorBille;

    public Billard(Vector<Bille> billes)
    {
        this.billes = billes;
    }
    /* (non-Javadoc)
     * @see java.awt.Canvas#paint(java.awt.Graphics)
     */
    @Override
    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        visitorBille = new Dessinateur(graphics);
        int i;

        for ( i = 0; i < this.billes.size(); ++i)
            this.billes.get(i).dessine(visitorBille);

        //System.out.println("billes dans le billard = " + billes);
    }



}
