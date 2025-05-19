package clase;

public class PlataCash implements StrategiePlata{

    @Override
    public void realizeazaPlata(double valoare) {
        System.out.println("S-a realizat plata cash: "+ valoare);
    }
}
