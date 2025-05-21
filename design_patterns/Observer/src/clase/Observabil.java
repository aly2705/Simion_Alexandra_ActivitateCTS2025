package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observer> observatori;

    public Observabil() {
        this.observatori = new ArrayList<>();
    }

    public void abonareObervator(Observer observator){
        this.observatori.add(observator);
    }

    public void dezabonareObervator(Observer observator){
        this.observatori.remove(observator);
    }

    public void notificareObservatori(String mesaj){
        for(Observer obs : observatori){
            obs.notificare(mesaj);
        }
    }

    public abstract void descrieScop();
}
