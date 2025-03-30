package factoryMethod.clase;

public class Medic extends Angajat{
    private double spor;


    public Medic(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }
}
