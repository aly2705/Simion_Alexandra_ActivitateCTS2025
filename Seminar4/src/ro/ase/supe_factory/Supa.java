package ro.ase.supe_factory;

public abstract class Supa {
    protected int gramaj;
    protected double pretSutaGrame;
    protected String ingrediente;

    public abstract void preparare();

    public double calculPret() {
        return pretSutaGrame * gramaj / 100;
    };

    public Supa(int gramaj, double pretSutaGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretSutaGrame = pretSutaGrame;
        this.ingrediente = ingrediente;
    }
}
