package observer;

import son.GestionAudio;

import java.util.Observable;

public class ObserverSon implements java.util.Observer {

    public ObserverSon(){

    }

    @Override
    public void update(Observable o, Object arg) {
        new GestionAudio().start();
    }

}
