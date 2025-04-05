package main;

import clase.IRezervareBuilder;
import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IRezervareBuilder builder = new RezervareBuilder("Maria Popa", 4);
        builder.setDecorareMasa(true).setScauneErgonomice(true);

        Rezervare rezervare1 = builder.build();
        System.out.println(rezervare1);

        builder.setMuzicaAmbientalaPersonalizata(true, "Pop").setAsezareGeam(true);
        Rezervare rezervare2 = builder.build();
        System.out.println(rezervare2);
        System.out.println(rezervare1);
    }
}
