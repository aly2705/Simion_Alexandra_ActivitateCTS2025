package personalFactory;

public class Asistent extends PersonalSpital {
    private String saloane;

    public Asistent(String nume, int salariu) {
        super(nume, salariu);
        this.saloane = "30, 31, 32, 33";
    }

    @Override
    public void descrieRol() {
        System.out.println("Ocupatie: ingrijirea pacientilor. Saloane in care activeaza: "+ saloane);
    }
}
