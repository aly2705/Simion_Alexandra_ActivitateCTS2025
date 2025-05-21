package clase;

import java.util.ArrayList;
import java.util.List;

public class CatalogOferte extends Observabil{
    private List<String> oferte;

    public CatalogOferte() {
        this.oferte = new ArrayList<>();
    }

    public void publicaOfertaNoua(String oferta){
        this.oferte.add(oferta);
        super.notificareObservatori(oferta);
    }

    @Override
    public void descrieScop() {
        System.out.println("Notifica grupul clientilor abonati cu cele mai noi oferte");
    }
}
