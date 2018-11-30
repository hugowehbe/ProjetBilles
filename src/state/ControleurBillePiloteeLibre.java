package state;

import decorateur.BillePilotee;
import mesmaths.geometrie.base.Vecteur;

public class ControleurBillePiloteeLibre extends ControleurEtatBillePilotee {

    public ControleurBillePiloteeLibre(BillePilotee bille, ControleurEtatBillePilotee suivant, ControleurEtatBillePilotee retour) {
        super(bille, suivant, retour);
    }

    @Override
    protected void MousePressed(Vecteur mousePosition) {
        double checkDistance = Math.sqrt(Math.pow((mousePosition.x - bille.getPosition().x),2) + Math.pow((mousePosition.y - bille.getPosition().y), 2) );
        if(checkDistance <= bille.getRayon()) { this.bille.setCourant(this.suivant); }
    }

    @Override
    protected void MouseReleased() { }

    @Override
    public String toString() {
        return "Libre";
    }

}