package ro.cts.model.personal;

public abstract class Persoana implements IPersoana {


    protected String nume;
    protected  int varsta;

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public abstract void afiseazaModInvatare();
}
