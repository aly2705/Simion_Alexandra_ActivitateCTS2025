package clase;

public class RezervareBuilder implements IRezervareBuilder {
    private String nume;
    private int nrPersoane;
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public RezervareBuilder(String nume, int nrPersoane) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.asezareGeam = false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.muzicaAmbientalaPersonalizata = false;
        this.genMuzica = "Fara muzica personalizata";
    }

    @Override
    public IRezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    @Override
    public IRezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    @Override
    public IRezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    @Override
    public IRezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        return this;
    }

    @Override
    public IRezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata, String gen) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        if(muzicaAmbientalaPersonalizata){
            this.genMuzica = gen;
        }

        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(nume, nrPersoane, asezareGeam, scauneErgonomice, decorareMasa, muzicaAmbientalaPersonalizata, genMuzica);
    }
}
