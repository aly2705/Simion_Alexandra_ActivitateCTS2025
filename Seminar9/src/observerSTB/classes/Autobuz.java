package observerSTB.classes;

import java.util.List;

public class Autobuz extends MijlocTransport{

    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        String mesaj = "Autobuzul cu numarul "+ this.getNumarLinie()+ " pleaca de la capat.";
        this.trimiteMesaj(mesaj);
    }

    public void schimbaTraseul() {
        String mesaj = "Autobuzul cu numarul "+ this.getNumarLinie()+ " va circula prin bulevardul X.";
        trimiteMesaj(mesaj);
    }
}
