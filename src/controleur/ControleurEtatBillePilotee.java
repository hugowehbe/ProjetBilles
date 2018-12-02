package controleur;

import java.awt.event.MouseEvent;

import modele.decorateur.BillePilotee;
import mesmaths.geometrie.base.Vecteur;

public abstract class ControleurEtatBillePilotee {

    protected BillePilotee bille;
    protected ControleurEtatBillePilotee suivant;
    protected ControleurEtatBillePilotee retour;

    public ControleurEtatBillePilotee(BillePilotee bille, ControleurEtatBillePilotee suivant, ControleurEtatBillePilotee retour) {
        this.bille = bille;
        this.suivant = suivant;
        this.retour = retour;
    }

    protected abstract void MousePressed(Vecteur mousePosition);

    protected abstract void MouseReleased();

    public abstract String toString();

    public void setSuivant(ControleurEtatBillePilotee suivant) {
        this.suivant = suivant;
    }

    public void setRetour(ControleurEtatBillePilotee retour) {
        this.retour = retour;
    }

    public void MouseEvent(MouseEvent mouse) {
        if (mouse.getID() == MouseEvent.MOUSE_PRESSED) {
            Vecteur mousePosition = new Vecteur(mouse.getX(), mouse.getY());
            this.MousePressed(mousePosition);
        } else if (mouse.getID() == MouseEvent.MOUSE_RELEASED) {
            this.MouseReleased();
        }
    }
}