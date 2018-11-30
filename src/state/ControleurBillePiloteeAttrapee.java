package state;

import decorateur.BillePilotee;
import mesmaths.geometrie.base.Vecteur;

public class ControleurBillePiloteeAttrapee extends ControleurEtatBillePilotee {

    public ControleurBillePiloteeAttrapee(BillePilotee bille, ControleurEtatBillePilotee suivant, ControleurEtatBillePilotee retour) {
        super(bille, suivant, retour);
    }

    @Override
    protected void MousePressed(Vecteur mousePosition) { }

    @Override
    protected void MouseReleased() { bille.setCourant(this.suivant); }

    @Override
    public String toString() {
        return "Attrapé";
    }
}