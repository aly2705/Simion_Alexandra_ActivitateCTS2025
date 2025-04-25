package clase;

public class Rezervare implements IRezervare {
    public Rezervare() {
    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane, int ora) {
        System.out.println("S-a facut o rezervare pentru "+ nrPersoane + " persoane, la ora " + ora+ " pe numele "+ numeClient);
    }
}
