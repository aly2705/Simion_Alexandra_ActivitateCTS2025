package classes;

public class SupaVita extends FelMancare {
    private boolean extraSmanatana;

    public SupaVita(double pret, int gramaj, boolean extraSmanatana) {
        super(pret, gramaj);
        this.extraSmanatana = extraSmanatana;
    }

    @Override
    public void adaugaExtra() {
        this.extraSmanatana = true;
    }

    @Override
    public void descrieFel() {
        double pretFinal = this.extraSmanatana? ((FelMancare.adaosExtra+1) * pret) : pret;
        System.out.println("Supa de vita are "+ gramaj + " grame, costa " + pretFinal + " lei " + (this.extraSmanatana ? " si a fost comandata cu extra smantana" : "") );
    }
}
