package factoryMethod.clase;

public class Portar extends Angajat{
    private int vechime;


    public Portar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }
}
