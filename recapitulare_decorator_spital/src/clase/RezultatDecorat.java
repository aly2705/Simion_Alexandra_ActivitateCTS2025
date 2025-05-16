package clase;

public abstract class RezultatDecorat implements IRezultat {
    IRezultat rezultat;

    public RezultatDecorat(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void eliberare() {
        this.rezultat.eliberare();
    }

    public abstract void eliberareOnline();
}
