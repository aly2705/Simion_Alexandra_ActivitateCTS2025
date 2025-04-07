package classes;

public class CheeseCake extends FelMancare{
    private boolean extraTopping;

    public CheeseCake(double pret, int gramaj, boolean extraTopping) {
        super(pret, gramaj);
        this.extraTopping = extraTopping;
    }

    @Override
    public void adaugaExtra() {
        this.extraTopping = true;
    }

    @Override
    public void descrieFel() {
        double pretFinal = this.extraTopping? ((FelMancare.adaosExtra+1) * pret) : pret;
        System.out.println("Cheesecake-ul are "+ gramaj + " grame, costa " + pretFinal + " lei " + (this.extraTopping ? " si a fost comandat cu extra topping" : "") );
    }
}
