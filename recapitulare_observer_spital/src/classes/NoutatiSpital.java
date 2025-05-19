package classes;

import java.util.ArrayList;
import java.util.List;

public class NoutatiSpital implements Observabil{
    private List<Observer> observatori;

    public NoutatiSpital() {
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

    public void notificareVirusRaportat(){
        this.notificareObservatori("A fost raportat un virus nou");
    }
}
