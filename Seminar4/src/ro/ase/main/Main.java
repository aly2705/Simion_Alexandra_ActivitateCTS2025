package ro.ase.main;


import ro.ase.rezervari_prototype.AbstractRezervare;
import ro.ase.rezervari_prototype.Rezervare;
import ro.ase.supe_factory.Factory;
import ro.ase.supe_factory.Supa;
import ro.ase.supe_factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {
        Factory soupFactory = new Factory(200, 10);

        Supa supa1 = soupFactory.getSupa(TipuriSupe.LEGUME, "Legume pasate", 100);
        supa1.preparare();

        Supa supa2 = soupFactory.getSupa(TipuriSupe.CIUPERCI, "Legume, ciuperci, smantana", 100);
        supa2.preparare();

        Supa supa3 = soupFactory.getSupa(TipuriSupe.VITA, "Vita, legume, smantana si ardei extra", 100);
        supa3.preparare();


        AbstractRezervare rezervare = new Rezervare("Kevin", 7, "2020-10-20");
        rezervare.descriere();

        AbstractRezervare rezervareNoua = rezervare.cloneaza();
        rezervareNoua.descriere();
    }
}