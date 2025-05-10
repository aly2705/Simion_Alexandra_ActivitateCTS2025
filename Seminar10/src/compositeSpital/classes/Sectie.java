package compositeSpital.classes;

public class Sectie extends StructuraAbs{


    public Sectie(String nume, int nrAng) {
        super(nume, nrAng);
    }

    @Override
    public void adaugaNod(StructuraAbs s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void stergeNod(StructuraAbs s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public StructuraAbs getNodCopil(int indexCopil) {
        return this;
    }

    @Override
    public void afiseazaDesc(StructuraAbs s, String tab) {
        System.out.println(tab+this.getNume());
    }

    @Override
    public int calcNrAngajati() {
        return this.getNrAng();
    }
}