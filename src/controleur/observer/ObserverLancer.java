package controleur.observer;

import controleur.AnimationBilles;

import java.util.Observable;

public class ObserverLancer extends Observer {

    public ObserverLancer(AnimationBilles animationBilles) {
        super(animationBilles);
    }

    @Override
    public void update(Observable o, Object arg) {
        animationBilles.lancerAnimation();
    }
}
