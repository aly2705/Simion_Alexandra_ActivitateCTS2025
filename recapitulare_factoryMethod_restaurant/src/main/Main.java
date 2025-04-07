package main;

import classes.FelMancare;
import factory.*;

public class Main {
    public static void main(String[] args) {
        FelMancareFactory factorySupe = new SupaFactory();
        FelMancareFactory factoryDesert = new DesertFactory();

        FelMancare supaCiuperci = factorySupe.creareFelMancare(TipSupa.CIUPERCI, 20, 200, false);
        supaCiuperci.adaugaExtra();
        supaCiuperci.descrieFel();

        FelMancare supaLegume = factorySupe.creareFelMancare(TipSupa.LEGUME, 23, 250, false);
        supaLegume.descrieFel();


        FelMancare supaVita = factorySupe.creareFelMancare(TipSupa.CIUPERCI, 21, 300, false);
        supaVita.adaugaExtra();
        supaVita.descrieFel();


        FelMancare papanasi = factoryDesert.creareFelMancare(TipDesert.PAPANASI, 28, 450, true);
        papanasi.descrieFel();

        FelMancare clatite = factoryDesert.creareFelMancare(TipDesert.CLATITE, 25, 380, false);
        clatite.adaugaExtra();
        clatite.descrieFel();

        FelMancare cheesecake = factoryDesert.creareFelMancare(TipDesert.CHEESECAKE, 32, 400, false);
        cheesecake.descrieFel();
    }
}
