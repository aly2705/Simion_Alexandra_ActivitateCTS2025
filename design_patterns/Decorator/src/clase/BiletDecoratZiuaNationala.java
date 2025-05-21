package clase;

public class BiletDecoratZiuaNationala extends BiletDecoratOcazie{
    public BiletDecoratZiuaNationala(IBilet biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareMesajSpecial() {
        System.out.println("La multi ani, Romania!");
    }
}
