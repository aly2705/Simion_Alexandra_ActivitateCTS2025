package classes;

public class Rezervare {
    private int numarMasa;
    private int nrPersoane;
    private String oraRezervare;

    public Rezervare(int numarMasa, int nrPersoane, String oraRezervare) {
        this.numarMasa = numarMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

}
