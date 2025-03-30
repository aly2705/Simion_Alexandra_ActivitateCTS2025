package builderForma1.clase;

public class PacientBuilder implements AbstractBuilder{
    private Pacient pacient;

    public PacientBuilder(String nume) {
        this.pacient = new Pacient(nume, false, false, false, false, "pacient random");
    }

    @Override
    public Pacient getPacient() {
        return this.pacient;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil){
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun){
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci){
        this.pacient.setArePapuci(arePapuci);
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat){
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor){
        this.pacient.setNumeInsotitor(numeInsotitor);
        return this;
    }
}
