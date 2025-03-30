package builderForma2.clase;

import builderForma2.clase.Pacient;

public class PacientBuilder implements AbstractBuilder {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;
    private String numeInsotitor;

    public PacientBuilder() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuci = false;
        this.areHalat = false;
        this.numeInsotitor = "alt pacient";
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
        return this;
    }

    @Override
    public Pacient build(String nume) {
        return new Pacient(nume, this.arePatRabatabil, this.areMicDejun, this.arePapuci, this.areHalat, this.numeInsotitor);
    }


}
