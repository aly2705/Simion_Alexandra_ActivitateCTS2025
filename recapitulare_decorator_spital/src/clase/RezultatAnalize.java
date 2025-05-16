package clase;

import java.util.Map;

public class RezultatAnalize implements IRezultat {
    private String nume;
    private Map<String, Double> analize;

    public RezultatAnalize(String nume, Map<String, Double> analize) {
        this.nume = nume;
        this.analize = analize;
    }

    @Override
    public void eliberare() {
        System.out.println("Pacient: "+ nume);
        for (var analiza: analize.entrySet()){
            System.out.println("[Analiza=" +analiza.getKey() +"] "+analiza.getValue());
        }
    }
}
