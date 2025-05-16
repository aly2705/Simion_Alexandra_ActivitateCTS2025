package clase;

public class RezultatOnline extends RezultatDecorat {
    public RezultatOnline(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void eliberareOnline() {
        System.out.println("Se elibereaza rezultatele online");
    }
}
