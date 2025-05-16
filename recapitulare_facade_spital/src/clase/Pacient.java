package clase;

public class Pacient {
    private String nume;
    private String starePacient;

    public Pacient(String nume, String starePacient) {
        this.nume = nume;
        this.starePacient = starePacient;
    }

    public String getStarePacient() {
        return starePacient;
    }

    public String getNume() {
        return nume;
    }
}
