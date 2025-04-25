package clase;

public class RezervareProxy implements IRezervare {
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane, int ora) {
        if(nrPersoane>=4){
            rezervare.realizeazaRezervare(numeClient, nrPersoane, ora);
        }else {
            System.out.println("Nu este nevoie de rezervare");
        }
    }
}
