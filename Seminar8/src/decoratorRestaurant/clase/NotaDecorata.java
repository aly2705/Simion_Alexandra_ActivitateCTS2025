package decoratorRestaurant.clase;

public abstract class NotaDecorata implements INotaPlata {
    private INotaPlata notaPlata;

    public NotaDecorata(INotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void printeaza() {
        notaPlata.printeaza();
        this.printeazaFelicitare();
    }

    protected abstract void printeazaFelicitare();
}
