package compositeSpital.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbs{

    private List<StructuraAbs> supdpt;

    public Departament(String nume, int nrAng) {
        super(nume, nrAng);
        this.supdpt = new ArrayList<>();
    }

    @Override
    public void adaugaNod(StructuraAbs s) {
        supdpt.add(s);
    }

    @Override
    public void stergeNod(StructuraAbs s) {
        supdpt.remove(s);
    }

    @Override
    public StructuraAbs getNodCopil(int indexCopil) {
        return supdpt.get(indexCopil);
    }

    @Override
    public void afiseazaDesc(StructuraAbs s, String tab) {
        System.out.println(tab+"Dpt cu numele "+ s.getNume()+" are subdpt: ");

        for (StructuraAbs sup : supdpt) {
            sup.afiseazaDesc(s,tab+"    ");
        }
    }

    @Override
    public int calcNrAngajati() {

        int count = 0;
        for (StructuraAbs s : supdpt) {
            count += s.calcNrAngajati();
        }

        return count+this.getNrAng();
    }
}