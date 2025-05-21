package clase;

public class Adapter extends TitluCalatorieMetrou{
    private TitluCalatorie titluSuprafata;

    public Adapter(String titular, TitluCalatorie titluSuprafata) {
        super(titular);
        this.titluSuprafata = titluSuprafata;
    }

    @Override
    public void valideazaIntrareMetrou() {
        this.titluSuprafata.valideazaCalatorie();
    }
}
