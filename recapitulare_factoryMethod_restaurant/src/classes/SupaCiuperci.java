package classes;

public class SupaCiuperci extends FelMancare{
    private boolean extraCrutoane;

    public SupaCiuperci(double pret, int gramaj, boolean extraCrutoane) {
        super(pret, gramaj);
        this.extraCrutoane = extraCrutoane;
    }

    @Override
    public void adaugaExtra() {
        this.extraCrutoane = true;
    }

    @Override
    public void descrieFel() {
        double pretFinal = this.extraCrutoane? ((FelMancare.adaosExtra+1) * pret) : pret;
        System.out.println("Supa de ciuperci are "+ gramaj + " grame, costa " + pretFinal + " lei " + (this.extraCrutoane ? " si a fost comandata cu extra crutoane" : "") );
    }
}
