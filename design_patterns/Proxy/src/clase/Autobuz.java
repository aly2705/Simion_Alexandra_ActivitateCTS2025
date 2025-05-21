package clase;

public class Autobuz implements IAutobuz{
    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void opresteInStatie(String numeStatie, int nrPersoaneStatie) {
        System.out.println("Autobuzul opreste in statia: "+ numeStatie);
    }
}
