package classes;

import java.util.ArrayList;
import java.util.List;

public interface Observabil {
    void abonareObervator(Observer observator);
    void dezabonareObervator(Observer observator);
    void notificareObservatori(String mesaj);
}
