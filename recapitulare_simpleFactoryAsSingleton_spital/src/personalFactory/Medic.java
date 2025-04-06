package personalFactory;

public class Medic extends PersonalSpital {
    private int nrPacienti;

    public Medic(String nume, int salariu) {
        super(nume, salariu);
        this.nrPacienti = 1;
    }

    @Override
    public void descrieRol() {
        System.out.println("Ocupatie: tratarea pacientilor. Pacienti in grija: "+ nrPacienti);
    }
}
