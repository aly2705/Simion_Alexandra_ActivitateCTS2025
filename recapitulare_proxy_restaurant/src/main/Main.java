package main;

import clase.IRezervare;
import clase.Rezervare;
import clase.RezervareProxy;
import clase.RezervareProxyOra;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new RezervareProxy(rezervare);

        proxy.realizeazaRezervare("Maria", 3, 16);
        proxy.realizeazaRezervare("Maria", 3, 16);

        IRezervare proxyCompus = new RezervareProxyOra(proxy);
        proxyCompus.realizeazaRezervare("Ion", 5, 9);
        proxyCompus.realizeazaRezervare("Ion", 3, 18);
        proxyCompus.realizeazaRezervare("Ion", 4, 19);
    }
}
