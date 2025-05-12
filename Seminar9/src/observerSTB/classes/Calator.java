package observerSTB.classes;

public class Calator implements Observer{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume + "ai primit un mesaj: "+ mesaj);
    }
}
