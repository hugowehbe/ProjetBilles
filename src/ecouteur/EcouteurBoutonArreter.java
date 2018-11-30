package ecouteur;

import exodecorateur_angryballs.maladroit.AnimationBilles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;


/**
 *  ICI : IL N'Y A RIEN A CHANGER 
 *
 *  */

public class EcouteurBoutonArreter extends Observable implements ActionListener
{
    public EcouteurBoutonArreter() { }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setChanged();
        this.notifyObservers();
    }

}
