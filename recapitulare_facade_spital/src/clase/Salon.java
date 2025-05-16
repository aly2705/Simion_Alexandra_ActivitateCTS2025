package clase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Salon {
    private Map<Integer, String> paturi;

    public Salon(Map<Integer, String> paturi) {
        this.paturi = paturi;
    }

    public Integer gasestePatDisponibil(){
        final Integer[] numarPatLiber = {-1};
        paturi.entrySet().forEach((pat) -> {
            if(Objects.equals(pat.getValue(), "disponibil") && numarPatLiber[0] == -1){
                numarPatLiber[0] = pat.getKey();
            }
        });
        return numarPatLiber[0];
    }

    public void ocuparePat(Integer nrPat){
        this.paturi.put(nrPat, "ocupat");
    }
}
