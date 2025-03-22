package ro.ase.rezervari_prototype;

public class Rezervare extends AbstractRezervare {

    public Rezervare() {
        super();
    }

    public Rezervare(String numeClient, int nrPersoane, String data) {
        super(numeClient, nrPersoane, data);
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public AbstractRezervare cloneaza() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient = this.numeClient;
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.data = this.data;

        return rezervare;
    }
}
