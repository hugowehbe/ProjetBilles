package observer;

import exodecorateur_angryballs.maladroit.AnimationBilles;
import son.AudiosBilles;

import java.util.Observable;

public class Observer implements java.util.Observer {

    protected AnimationBilles animationBilles;

    protected AudiosBilles audiosBilles;

    public Observer(AnimationBilles animationBilles,AudiosBilles audiosBilles) {
        this.animationBilles = animationBilles;
        this.audiosBilles = audiosBilles;
    }

    public Observer(){

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
