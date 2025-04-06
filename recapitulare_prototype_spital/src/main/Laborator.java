package main;

import clase.AbstractRetetaMedicament;
import clase.RetetaMedicament;

import java.util.ArrayList;
import java.util.List;

public class Laborator {
    public static void main(String[] args) {
        List<String> substante = new ArrayList<>();
        substante.add("Corector de aciditate");
        substante.add("Acid citric");

        List<Integer> cantitati = new ArrayList<>();
        cantitati.add(20);
        cantitati.add(50);

        AbstractRetetaMedicament retetaPrototip = new RetetaMedicament("Ibuprofen", 400, "Merofen", substante, cantitati, Boolean.FALSE);
        System.out.println(retetaPrototip.toString());

        AbstractRetetaMedicament retetaMedicament = retetaPrototip.clone();
        System.out.println(retetaMedicament.toString());
    }
}
