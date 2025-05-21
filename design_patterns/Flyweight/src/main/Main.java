package main;

import clase.Autobuz;
import clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("B-12-ARM", "Mercedes 100", 50, 2005);
        Autobuz autobuz2 = new Autobuz("B-06-MIA", "Mercedes 200", 40, 2010);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getLinie(11, "Berceni", "Unirii").descrieLiniaAutobuzului(autobuz1);

        try {
            System.out.println();
            flyweightFactory.getLinie(11).descrieLiniaAutobuzului(autobuz2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
