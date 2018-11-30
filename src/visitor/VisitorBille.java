package visitor;

import modele.Bille;

public abstract class VisitorBille {

    public VisitorBille() {

    }

    public abstract void visite(Bille bille);
}