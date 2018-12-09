package controleur.observer;

import controleur.AnimationBilles;

import java.util.Observable;

public class Observer implements java.util.Observer {

    protected AnimationBilles animationBilles;

    public Observer(AnimationBilles animationBilles) {
        this.animationBilles = animationBilles;
    }

    public Observer() {
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
