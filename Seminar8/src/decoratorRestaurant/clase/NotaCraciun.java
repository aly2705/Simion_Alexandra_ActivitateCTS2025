package decoratorRestaurant.clase;

public class NotaCraciun extends NotaDecorata {
    public NotaCraciun(INotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
