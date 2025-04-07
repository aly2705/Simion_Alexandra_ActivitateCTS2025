package classes;

public class Papanasi extends  FelMancare{
    private boolean extraGem;

    public Papanasi(double pret, int gramaj, boolean extraGem) {
        super(pret, gramaj);
        this.extraGem = extraGem;
    }

    @Override
    public void adaugaExtra() {
        this.extraGem = true;
    }

    @Override
    public void descrieFel() {
        double pretFinal = this.extraGem? ((FelMancare.adaosExtra+1) * pret) : pret;
        System.out.println("Papanasii au "+ gramaj + " grame, costa " + pretFinal + " lei " + (this.extraGem ? " si au fost comandati cu extra gem" : "") );
    }
}
