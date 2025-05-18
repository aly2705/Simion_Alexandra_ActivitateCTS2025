package clase;

public class ItemMeniu extends OptiuneMeniu{
    private double pret;

    public ItemMeniu(String nume, double pret) {
        super(nume);
        this.pret = pret;
    }

    @Override
    public void adaugareNod(OptiuneMeniu optiune) {
        throw new UnsupportedOperationException("Operatia nu este suportata");
    }

    @Override
    public void stergereNod(OptiuneMeniu optiune) {
        throw new UnsupportedOperationException("Operatia nu este suportata");
    }

    @Override
    public OptiuneMeniu getNod(int index) {
        throw new UnsupportedOperationException("Operatia nu este suportata");
    }

    @Override
    public void afiseaza(String tab) {
        System.out.println(tab + this.getNume() + "-----------" + pret + " lei");
    }
}
