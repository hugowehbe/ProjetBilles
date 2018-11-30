package observer;

import exodecorateur_angryballs.maladroit.AnimationBilles;
import son.AudiosBilles;

import java.util.Observable;

public class ObserverArret extends  Observer{

    public ObserverArret(AnimationBilles animationBilles, AudiosBilles audiosBilles) {
        super(animationBilles,audiosBilles);
    }

    @Override
    public void update(Observable o, Object arg) {
       animationBilles.arrêterAnimation();
        audiosBilles.arrêterAudio();
    }
}
