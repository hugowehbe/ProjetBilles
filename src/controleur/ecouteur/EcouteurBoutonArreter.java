package controleur.ecouteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class EcouteurBoutonArreter extends Observable implements ActionListener
{
    public EcouteurBoutonArreter() { }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setChanged();
        this.notifyObservers();
    }

}
