package clase;

public class RezervareBuilder implements IRezervareBuilder {
    private Rezervare rezervare;

    public RezervareBuilder(String nume, int nrPersoane){
        this.rezervare = new Rezervare(nume, nrPersoane);
    }

    @Override
    public IRezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.rezervare.setAsezareGeam(asezareGeam);
        return this;
    }

    @Override
    public IRezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    @Override
    public IRezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    @Override
    public IRezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    @Override
    public IRezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata, String gen) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        if(muzicaAmbientalaPersonalizata){
            this.rezervare.setGenMuzica(gen);
        }

        return this;
    }

    @Override
    public Rezervare getRezervare() {
        return this.rezervare;
    }
}
