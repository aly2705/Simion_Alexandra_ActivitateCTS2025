package main;

import classes.NoutatiSpital;
import classes.PacientInregistrat;

public class Main {
    public static void main(String[] args) {
        PacientInregistrat pacient1 = new PacientInregistrat("Ioana");
        PacientInregistrat pacient2 = new PacientInregistrat("Maria");
        PacientInregistrat pacient3 = new PacientInregistrat("Simona");

        NoutatiSpital modulAnunturi = new NoutatiSpital();
        modulAnunturi.abonareObervator(pacient1);
        modulAnunturi.abonareObervator(pacient2);

        modulAnunturi.notificareVirusRaportat();

        modulAnunturi.dezabonareObervator(pacient1);
        modulAnunturi.abonareObervator(pacient3);

        modulAnunturi.notificareVirusRaportat();
    }
}
