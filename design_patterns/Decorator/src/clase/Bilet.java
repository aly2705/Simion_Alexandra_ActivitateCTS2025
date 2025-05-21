package clase;

public class Bilet implements IBilet{
    private String titular;
    private int nrCalatorii;

    public Bilet(String titular, int nrCalatorii) {
        this.titular = titular;
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void printare() {
        System.out.println("----------------------");
        System.out.println("Titular: "+titular);
        System.out.println("Nr calatorii: "+nrCalatorii);
    }
}
