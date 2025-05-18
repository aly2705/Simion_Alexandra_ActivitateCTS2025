package clase;

public abstract class OptiuneMeniu {
    private String nume;

    public OptiuneMeniu(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void adaugareNod(OptiuneMeniu optiune);
    public abstract void stergereNod(OptiuneMeniu optiune);
    public abstract OptiuneMeniu getNod(int index);

    public abstract void afiseaza(String tab);
}
