package clase;

public abstract class Vehicul {
    protected String nrInmaticulare;
    protected String numeProprietar;

    public Vehicul(String nrInmaticulare, String numeProprietar) {
        this.nrInmaticulare = nrInmaticulare;
        this.numeProprietar = numeProprietar;
    }

    public String getNumeProprietar() {
        return numeProprietar;
    }

    public String getNrInmaticulare() {
        return nrInmaticulare;
    }



    public abstract void descrieVehicul();
}
