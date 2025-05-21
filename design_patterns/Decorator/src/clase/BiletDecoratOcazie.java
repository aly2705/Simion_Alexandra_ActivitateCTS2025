package clase;

public abstract class BiletDecoratOcazie implements IBilet{
    private IBilet biletDecorat;

    public BiletDecoratOcazie(IBilet biletDecorat) {
        this.biletDecorat = biletDecorat;
    }

    @Override
    public void printare() {
        this.biletDecorat.printare();
        this.printareMesajSpecial();
    }

    public abstract void printareMesajSpecial();
}
