package ro.ase.rezervari_prototype;

public abstract class AbstractRezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;

    public AbstractRezervare() {
        this.numeClient = "N/A";
        this.nrPersoane = 2;
        this.data = "01-01-2020";
    }

    public AbstractRezervare(String numeClient, int nrPersoane, String data) {
        if(numeClient.length() > 3){
            this.numeClient = numeClient;
        } else {
            this.numeClient = "N/A";
        }
        if(nrPersoane > 2){
            this.nrPersoane = nrPersoane;
        } else {
            this.nrPersoane = 20;
        }

        this.data = data;
    }

    public abstract  void descriere();

    public abstract AbstractRezervare cloneaza();
}
