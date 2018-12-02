package modele.decorateur;

import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;


import controleur.ControleurEtatBillePilotee;
import controleur.ControleurBillePiloteeAttrapee;
import controleur.ControleurBillePiloteeLibre;
import controleur.ecouteur.EcouteurSouris;
import mesmaths.geometrie.base.Vecteur;
import modele.Bille;


public class BillePilotee extends DecorateurBille implements Observer
{
    EcouteurSouris souris;
    ControleurEtatBillePilotee courant;
    ControleurBillePiloteeAttrapee attrape;
    ControleurBillePiloteeLibre libre;

    public BillePilotee(Bille billeDecoree, EcouteurSouris souris)
    {
        super(billeDecoree);
        this.souris = souris;
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
    public void gestionAccélération(Vector<Bille> billes) {
        this.getBilleDecore().gestionAccélération(billes);
        if(courant == attrape) {
            this.getAccélération().ajoute(Vecteur.difference(souris.position, this.getPosition()).produit(10/this.masse()));
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