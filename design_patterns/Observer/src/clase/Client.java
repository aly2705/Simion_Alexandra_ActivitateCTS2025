package clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(nume+" ai primit o notificare!");
        System.out.println("[NOTIFICARE]: "+ mesaj);
    }
}
