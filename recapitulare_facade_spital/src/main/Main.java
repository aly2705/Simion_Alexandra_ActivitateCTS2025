package main;

import clase.Pacient;
import facade.FacadeInternare;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pacient maria = new Pacient("Maria Ionescu", "grava");
        Pacient ionut = new Pacient("Ionut Danescu", "stabila, necesita tratament acasa");
        Pacient cristian = new Pacient("Cristian Sima", "investigare urgenta");
        Pacient gigel = new Pacient("Gigel", "investigare urgenta");

        Map<Integer, String> paturiDisponibile = new HashMap<>();
        paturiDisponibile.put(1, "disponibil");
        paturiDisponibile.put(2, "ocupat");
        paturiDisponibile.put(3, "disponibil");

        FacadeInternare facadeInternare = new FacadeInternare();
        facadeInternare.verificaPosibilitateInternare(maria, paturiDisponibile);
        System.out.println();

        facadeInternare.verificaPosibilitateInternare(ionut, paturiDisponibile);
        System.out.println();

        facadeInternare.verificaPosibilitateInternare(cristian, paturiDisponibile);
        System.out.println();

        facadeInternare.verificaPosibilitateInternare(gigel, paturiDisponibile);
        System.out.println();
    }
}
