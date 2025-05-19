package clase;

public class Client {
    private String name;
    private String nrTelefon;
    private String email;

    public Client(String name, String nrTelefon, String email) {
        this.name = name;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getEmail() {
        return email;
    }
}
