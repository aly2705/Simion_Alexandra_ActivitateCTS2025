package classes;

public class Client implements IClient{
    private String nume;
    private String numarTelefon;
    private String email;

    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public void realizeazaRezervare(Rezervare rezervare) {
        System.out.println("S-a realizat o rezervare pentru "+nume);
        System.out.println("Detalii Contact: "+numarTelefon+", "+email);
        System.out.println("Informatii rezervare: " + rezervare.getNrPersoane() + " persoane, ora "+ rezervare.getOraRezervare());
    }
}
