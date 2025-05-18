package compositeSpital.classes;

public abstract class StructuraAbs {

    private String nume;
    private int nrAng;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAng() {
        return nrAng;
    }

    public void setNrAng(int nrAng) {
        this.nrAng = nrAng;
    }

    public StructuraAbs(String nume, int nrAng) {
        this.nume = nume;
        this.nrAng = nrAng;
    }

    public abstract void adaugaNod(StructuraAbs s);
    public abstract void stergeNod(StructuraAbs s);
    public abstract StructuraAbs getNodCopil(int indexCopil);

    public abstract void afiseazaDesc(StructuraAbs s, String tab);
    public abstract int calcNrAngajati();

}