package classes;

public class PacientInregistrat implements Observer {
    private String nume;

    public PacientInregistrat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(nume + ": [Notificare] "+ mesaj);
    }
}
