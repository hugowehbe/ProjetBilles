package controleur.observer;

import vues.AnimationBilles;

import java.util.Observable;

public class ObserverArret extends Observer {

    public ObserverArret(AnimationBilles animationBilles) {
        super(animationBilles);
    }

    @Override
    public void update(Observable o, Object arg) {
        animationBilles.arrêterAnimation();
    }
}
