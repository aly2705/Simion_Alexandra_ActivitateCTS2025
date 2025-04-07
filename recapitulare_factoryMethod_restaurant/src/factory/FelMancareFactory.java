package factory;

import classes.FelMancare;

public interface FelMancareFactory {
    public FelMancare creareFelMancare(TipFelMancare tip, double pret, int gramaj, boolean adaugaExtra);
}
