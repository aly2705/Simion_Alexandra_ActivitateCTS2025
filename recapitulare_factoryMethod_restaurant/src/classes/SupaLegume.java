package classes;

public class SupaLegume extends FelMancare {
    private boolean extraArdei;

    public SupaLegume(double pret, int gramaj, boolean extraArdei) {
        super(pret, gramaj);
        this.extraArdei = extraArdei;
    }

    @Override
    public void adaugaExtra() {
        this.extraArdei = true;
    }

    @Override
    public void descrieFel() {
        double pretFinal = this.extraArdei ? ((FelMancare.adaosExtra+1) * pret) : pret;
        System.out.println("Supa de legume are "+ gramaj + " grame, costa " + pretFinal  + " lei " + (this.extraArdei ? " si a fost comandata cu extra ardei" : "") );
    }
}
