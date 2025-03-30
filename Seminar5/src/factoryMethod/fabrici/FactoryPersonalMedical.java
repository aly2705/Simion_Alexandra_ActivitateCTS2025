package factoryMethod.fabrici;

import factoryMethod.clase.Angajat;
import factoryMethod.clase.Asistent;
import factoryMethod.clase.Medic;

public class FactoryPersonalMedical implements  FactoryPersonal {
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch(tipPersonal){
            case TipPersonalMedical.ASISTENT -> new Asistent(nume, salariu, spor);
            case TipPersonalMedical.MEDIC -> new Medic(nume, salariu, spor);
            default -> null;
        };
    }
}
