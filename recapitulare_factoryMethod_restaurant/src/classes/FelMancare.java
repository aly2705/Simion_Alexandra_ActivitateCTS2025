package classes;

public abstract class FelMancare {
    protected static double adaosExtra = 0.2;
    protected double pret;
    protected int gramaj;

    public FelMancare(double pret, int gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    public abstract void adaugaExtra();
    public abstract void descrieFel();
}
