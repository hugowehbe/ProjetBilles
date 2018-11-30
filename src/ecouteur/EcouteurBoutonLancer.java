package ecouteur;

import exodecorateur_angryballs.maladroit.AnimationBilles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 *  ICI : IL N'Y A RIEN A CHANGER 
 *
 *  */
public class EcouteurBoutonLancer extends Observable implements ActionListener
{
    public EcouteurBoutonLancer() { }

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
        this.setChanged();
        this.notifyObservers();
    }

}
