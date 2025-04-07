package factory;

import classes.CheeseCake;
import classes.Clatite;
import classes.FelMancare;
import classes.Papanasi;

public class DesertFactory implements FelMancareFactory {
    @Override
    public FelMancare creareFelMancare(TipFelMancare tip, double pret, int gramaj, boolean adaugaExtra) {
        return switch (tip) {
            case TipDesert.PAPANASI -> new Papanasi(pret,gramaj,adaugaExtra);
            case TipDesert.CLATITE -> new Clatite(pret, gramaj, adaugaExtra);
            case TipDesert.CHEESECAKE -> new CheeseCake(pret,gramaj,adaugaExtra);
            default -> null;
        };
    }
}
