package clase;

public class ModulPlata {
    private StrategiePlata strategiePlata;

    public ModulPlata(StrategiePlata strategiePlata) {
        this.strategiePlata = strategiePlata;
    }

    public void incaseaza(double valoare){
        strategiePlata.realizeazaPlata(valoare);
    }

    public void setStrategiePlata(StrategiePlata strategiePlata) {
        this.strategiePlata = strategiePlata;
    }
}
