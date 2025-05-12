package strategySTB.main;

import strategySTB.classes.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata plataCardCalatorie = new CardCalatorie(0);
        IMetodaPlata plataSMS = new PlataSMS();
        IMetodaPlata plataCardBancar = new CardBancar(7);

        Calator calator1 = new Calator("Ioana", plataCardCalatorie);
        calator1.platesteBilet(5);

        calator1.setMetodaPlata(plataCardBancar);
        calator1.platesteBilet(5);

        calator1.setMetodaPlata(plataSMS);
        calator1.platesteBilet(5);
    }
}
