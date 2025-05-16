package main;

import clase.RezultatAnalize;
import clase.RezultatDecorat;
import clase.RezultatOnline;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> analize = new HashMap<>();
        analize.put("Hemoglobina", 73.0);
        analize.put("Glicemie", 98.0);

        RezultatAnalize rezultatAnalize = new RezultatAnalize("Ioana Alexe", analize);
        rezultatAnalize.eliberare();

        System.out.println();

        RezultatDecorat rezultatDecorat = new RezultatOnline(rezultatAnalize);
        rezultatDecorat.eliberare();
        rezultatDecorat.eliberareOnline();
    }
}
