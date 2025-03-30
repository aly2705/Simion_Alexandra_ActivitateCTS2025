package factoryMethod.fabrici;

import factoryMethod.clase.*;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch(tipPersonal){
            case TipPersonalNonMedical.SECRETAR -> new Secretar(nume,salariu, vechime);
            case TipPersonalNonMedical.PORTAR -> new Portar(nume,salariu, vechime);
            default -> null;
        };
    }
}
