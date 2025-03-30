package factoryMethod.fabrici;

import factoryMethod.clase.Angajat;

public interface FactoryPersonal {
    Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
