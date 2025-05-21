package clase;

public class LinieAutobuz implements ILinieAutobuz{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public LinieAutobuz(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void descrieLiniaAutobuzului(Autobuz autobuz) {
        System.out.println(autobuz.getNrInmaticulare()+ " circula pe: ");
        System.out.println("[LINIA " + nrLinie +"] "+ primaStatie + "->"+ ultimaStatie);
        System.out.println("Detalii autobuz: "+autobuz.toString());
    }
}
