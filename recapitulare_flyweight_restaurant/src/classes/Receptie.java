package classes;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String, Client> clienti;

    public Receptie() {
        this.clienti = new HashMap<>();
    }

    public Client getClient(String email, String nume,  String numarTelefon) {
        if(!clienti.containsKey(email)){
            this.clienti.put(email, new Client(nume, numarTelefon, email));
        }
        return clienti.get(email);
    }

    public Client getClient(String email) throws Exception {
        if(!clienti.containsKey(email)){
            throw new Exception("Nu exista clientul cautat");
        }
        return clienti.get(email);
    }
}
