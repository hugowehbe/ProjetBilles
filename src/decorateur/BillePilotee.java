package decorateur;

import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;


import state.ControleurEtatBillePilotee;
import state.ControleurBillePiloteeAttrapee;
import state.ControleurBillePiloteeLibre;
import ecouteur.EcouteurSouris;
import mesmaths.geometrie.base.Vecteur;
import modele.Bille;


public class BillePilotee extends DecorateurBille implements Observer
{
    private static final double COEFF = 10;
    EcouteurSouris souris;
    ControleurEtatBillePilotee courant;
    ControleurBillePiloteeAttrapee attrape;
    ControleurBillePiloteeLibre libre;

    public BillePilotee(Bille billeDecoree, EcouteurSouris souris)
    {
        super(billeDecoree);
        this.souris = souris;

        //Ecouteur a changer, à mettre dans cadre
        souris.addObserver(this);
        initalize();
    }

    private void initalize() {
        attrape = new ControleurBillePiloteeAttrapee(this, null, null);
        libre = new ControleurBillePiloteeLibre(this, null, null);
        attrape.setSuivant(libre);
        attrape.setRetour(libre);
        libre.setSuivant(attrape);
        libre.setRetour(attrape);
        courant = libre;
    }


    @Override
    public void gestionAccélération(Vector<Bille> billes)
    {
        this.getBilleDecore().gestionAccélération(billes);
        if(courant == attrape) {
            Vecteur desiredDirection = Vecteur.difference(souris.position, this.getPosition());
            desiredDirection.multiplie(COEFF);
            this.getAccélération().ajoute(desiredDirection.produit(1/this.masse()));
            this.getVitesse().multiplie(0.9);
        }
    }

    @Override
    public void update(Observable arg0, Object mouseEvent) {
        courant.MouseEvent((MouseEvent) mouseEvent);
    }

    public void setCourant(ControleurEtatBillePilotee nouvelEtat) {
        this.courant = nouvelEtat;
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur, double hauteur) {
    }
}