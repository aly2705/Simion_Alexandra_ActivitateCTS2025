package factory;

import classes.FelMancare;
import classes.SupaCiuperci;
import classes.SupaLegume;
import classes.SupaVita;

public class SupaFactory implements FelMancareFactory {
    @Override
    public FelMancare creareFelMancare(TipFelMancare tip, double pret, int gramaj, boolean adaugaExtra) {
        return switch (tip){
            case TipSupa.CIUPERCI ->  new SupaCiuperci(pret,gramaj,adaugaExtra);
            case TipSupa.VITA -> new SupaVita(pret, gramaj,adaugaExtra);
            case TipSupa.LEGUME -> new SupaLegume(pret, gramaj, adaugaExtra);
            default -> null;
        };
    }
}
