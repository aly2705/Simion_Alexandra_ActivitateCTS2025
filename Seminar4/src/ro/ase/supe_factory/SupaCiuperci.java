package ro.ase.supe_factory;

public class SupaCiuperci extends Supa {
    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretSutaGrame, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretSutaGrame, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public double calculPret() {
        return super.calculPret() + pretSutaGrame * cantitateCiuperci/100;
    }

    @Override
    public void preparare() {
        System.out.println("Supa de ciuperci");
    }
}
