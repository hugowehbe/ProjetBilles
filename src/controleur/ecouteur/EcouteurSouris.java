package controleur.ecouteur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Observable;

import mesmaths.geometrie.base.Vecteur;

public class EcouteurSouris extends Observable implements MouseListener, MouseMotionListener {

    public Vecteur position;

    public EcouteurSouris() {
        position = new Vecteur();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        updateCurrentPosition(e);
        this.setChanged();
        this.notifyObservers(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        updateCurrentPosition(e);
        this.setChanged();
        this.notifyObservers(e);
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        updateCurrentPosition(arg0);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }


    private void updateCurrentPosition(MouseEvent cursor) {
        position.x = cursor.getX();
        position.y = cursor.getY();
    }

}