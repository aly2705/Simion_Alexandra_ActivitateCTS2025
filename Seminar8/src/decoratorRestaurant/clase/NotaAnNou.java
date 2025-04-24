package decoratorRestaurant.clase;

public class NotaAnNou extends NotaDecorata{

    public NotaAnNou(INotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("La multi ani de anul nou!");
    }
}
