package visitor;

import java.awt.Color;
import java.awt.Graphics;


import modele.Bille;

public class Dessinateur extends VisitorBille {

    Graphics g;

    public Dessinateur(Graphics graphics) {
        super();
        this.g = graphics;
    }

    @Override
    public void visite(Bille bille) {
        int width, height;
        int xMin, yMin;

        xMin = (int)Math.round(bille.getPosition().x - bille.getRayon());
        yMin = (int)Math.round(bille.getPosition().y - bille.getRayon());

        width = height = 2*(int)Math.round(bille.getRayon());

        g.setColor(bille.getCouleur());
        g.fillOval( xMin, yMin, width, height);
        g.setColor(Color.CYAN);
        g.drawOval(xMin, yMin, width, height);
    }

}