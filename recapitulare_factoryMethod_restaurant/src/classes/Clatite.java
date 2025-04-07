package classes;

public class Clatite extends FelMancare{
    private boolean extraTopping;

    public Clatite(double pret, int gramaj, boolean extraTopping) {
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
        System.out.println("Clatitele au "+ gramaj + " grame, costa " + pretFinal + " lei " + (this.extraTopping ? " si au fost comandate cu extra topping" : "") );
    }
}
