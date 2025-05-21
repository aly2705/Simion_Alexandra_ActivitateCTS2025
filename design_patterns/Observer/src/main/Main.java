package main;

import clase.CatalogOferte;
import clase.Client;
import clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("Maria");
        Observer client2 = new Client("Ion");

        CatalogOferte catalogOferte = new CatalogOferte();
        catalogOferte.abonareObervator(client1);
        catalogOferte.abonareObervator(client2);

        catalogOferte.publicaOfertaNoua("Au fost adaugati papanasi in meniu la doar 21.99 lei");
        catalogOferte.dezabonareObervator(client1);

        catalogOferte.publicaOfertaNoua("Vino la noi pana in ora 16 si vei primi desertul din partea casei");
    }
}
