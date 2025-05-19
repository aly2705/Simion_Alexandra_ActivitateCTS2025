package clase;

public class PlataCard implements StrategiePlata {
    @Override
    public void realizeazaPlata(double valoare) {
        System.out.println("S-a realizat plata card: "+ valoare);
    }
}
