package observerSTB.main;


import observerSTB.classes.Autobuz;
import observerSTB.classes.Calator;
import observerSTB.classes.MijlocTransport;
import observerSTB.classes.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("calator1");
        Observer calator2 = new Calator("calator2");
        Observer calator3 = new Calator("calator3");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);

        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator2);

        ((Autobuz)autobuz).schimbaTraseul();
    }
}
