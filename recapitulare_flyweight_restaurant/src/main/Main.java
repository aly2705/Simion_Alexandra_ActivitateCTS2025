package main;

import classes.Client;
import classes.Receptie;
import classes.Rezervare;


public class Main {
    public static void main(String[] args) {
        Receptie receptie = new Receptie();
        Rezervare rezervare1 = new Rezervare(7, 4, "22:30");
        Rezervare rezervare2 = new Rezervare(2, 2, "20:30");

        Client client = receptie.getClient("ioana@gmail.com", "Ioana Popa", "07898989");
        client.realizeazaRezervare(rezervare1);

        System.out.println();
        try {
            receptie.getClient("ioana@gmail.com").realizeazaRezervare(rezervare2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
