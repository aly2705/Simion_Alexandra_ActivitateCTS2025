package clase;

public interface IRezervareBuilder {
    public IRezervareBuilder setAsezareGeam(boolean asezareGeam);

    public IRezervareBuilder setScauneErgonomice(boolean scauneErgonomice);

    public IRezervareBuilder setDecorareMasa(boolean decorareMasa);

    public IRezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata);

    public IRezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata, String gen);

    public Rezervare getRezervare();
}
