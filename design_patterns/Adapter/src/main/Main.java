package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        TitluCalatorie abonamentSTB = new AbonamentSuprafata("Maria", 10);
        TitluCalatorie biletSTB = new BiletSuprafata(0);

        TitluCalatorieMetrou biletMetrouReal = new BiletMetrou("Ioana", 2);
        biletMetrouReal.valideazaIntrareMetrou();

        TitluCalatorieMetrou abonamentSTBAdaptat = new Adapter("Maria", abonamentSTB);
        abonamentSTBAdaptat.valideazaIntrareMetrou();

        TitluCalatorieMetrou biletSTBAdaptat = new Adapter("Ana", biletSTB);
        biletSTBAdaptat.valideazaIntrareMetrou();
    }
}
