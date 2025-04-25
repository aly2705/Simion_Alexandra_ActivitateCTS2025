package clase;

public class RezervareProxyOra implements IRezervare{
    private IRezervare rezervare;

    public RezervareProxyOra(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane, int ora) {
        if(ora > 10){
            rezervare.realizeazaRezervare(numeClient, nrPersoane, ora);
        } else {
            System.out.println("Nu se fac rezervari inainte de ora 11");
        }
    }
}
