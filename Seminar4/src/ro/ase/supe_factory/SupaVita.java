package ro.ase.supe_factory;

public class SupaVita extends Supa{
    private double pretSmantana;

    public SupaVita(int gramaj, double pretSutaGrame, String ingrediente, double pretSmantana) {
        super(gramaj, pretSutaGrame, ingrediente);
        this.pretSmantana = pretSmantana;
    }



    @Override
    public double calculPret() {
        return super.calculPret() + pretSmantana;
    }

    @Override
    public void preparare() {
        System.out.println("Supa de vita cu smantana extra");
    }
}
