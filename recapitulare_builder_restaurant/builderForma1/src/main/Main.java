package main;

import clase.IRezervareBuilder;
import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {
    //    Atunci când un client face o rezervare poate alege una din următoarele opțiuni: așezare la
    //    geam, scaune ergonomice, decorarea mesei, muzica ambientala personalizata, gen muzica. În cazul
    //    în care clientul nu specifică vreun element dintre acestea, este setat pe false. Să se implementeze
    //    modulul care permite crearea de obiecte de tip rezervare cu aceste opțiuni extra.
    public static void main(String[] args) {

        IRezervareBuilder builder = new RezervareBuilder("Ion", 5);
        Rezervare rezervare = builder.setMuzicaAmbientalaPersonalizata(true, "muzica usoara").setAsezareGeam(true).getRezervare();

        System.out.println(rezervare);

        IRezervareBuilder builder2 = new RezervareBuilder("Marcela", 2);
        builder.setAsezareGeam(true).setDecorareMasa(true);
        Rezervare rezervare2 = builder2.getRezervare();

        System.out.println(rezervare2);
    }
}
