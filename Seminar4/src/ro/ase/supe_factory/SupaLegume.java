package ro.ase.supe_factory;

public class SupaLegume extends Supa {
    private int gramajCrutoane;

    public SupaLegume(int gramaj, double pretSutaGrame, String ingrediente, int gramajCrutoane) {
        super(gramaj, pretSutaGrame, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public double calculPret() {
        return super.calculPret() + gramajCrutoane/100 * pretSutaGrame;
    }

    @Override
    public void preparare() {
        System.out.println("Supa de legume cu crutoane");
    }
}
