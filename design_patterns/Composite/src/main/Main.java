package main;

import clase.Autobuz;
import clase.Categorie;
import clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura autobuzMic1 = new Autobuz("Mercedes", "1100B", 8);
        Structura autobuzMic2 = new Autobuz("Iveco", "1200A", 10);

        Structura grupuriMici = new Categorie("Autobuze pentru grupuri mici");
        grupuriMici.adaugaNod(autobuzMic1);
        grupuriMici.adaugaNod(autobuzMic2);

        Structura autobuzMijlociu = new Autobuz("Mercedes", "11AB", 30);
        Structura grupuriMedii = new Categorie("Autobuze pentru grupuri medii");
        grupuriMedii.adaugaNod(autobuzMijlociu);


        Structura autobuzMare1 = new Autobuz("Mercedes", "BA100", 50);
        Structura autobuzMare2 = new Autobuz("BMV", "BA1002", 50);
        Structura autobuzMare3 = new Autobuz("BMV", "A1001", 50);

        Structura grupuriMari = new Categorie("Autobuze pentru grupuri mari");
        grupuriMari.adaugaNod(autobuzMare1);
        grupuriMari.adaugaNod(autobuzMare2);
        grupuriMari.adaugaNod(autobuzMare3);

        Structura ierahrie = new Categorie("Grupare autobuze");
        ierahrie.adaugaNod(grupuriMici);
        ierahrie.adaugaNod(grupuriMedii);
        ierahrie.adaugaNod(grupuriMari);

        ierahrie.descrie("");

        grupuriMari.stergereNod(autobuzMare1);
        ierahrie.descrie("");
    }
}
