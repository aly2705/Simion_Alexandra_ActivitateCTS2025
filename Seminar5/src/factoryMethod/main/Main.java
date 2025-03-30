package factoryMethod.main;

import factoryMethod.clase.Angajat;
import factoryMethod.fabrici.FactoryPersonalMedical;
import factoryMethod.fabrici.FactoryPersonalNonMedical;
import factoryMethod.fabrici.TipPersonalMedical;
import factoryMethod.fabrici.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(20.5);
        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(10);

        Angajat medic = factoryPersonalMedical.creareAngajat(TipPersonalMedical.MEDIC, "medic", 8000);
        factoryPersonalMedical.setSpor(10);

        Angajat asistent = factoryPersonalMedical.creareAngajat(TipPersonalMedical.ASISTENT, "asistent", 5000);

        Angajat portar = factoryPersonalNonMedical.creareAngajat(TipPersonalNonMedical.PORTAR, "portar", 2000);
        factoryPersonalMedical.setSpor(10);

        Angajat secretar = factoryPersonalNonMedical.creareAngajat(TipPersonalNonMedical.SECRETAR, "secretar", 6000);


    }
}
