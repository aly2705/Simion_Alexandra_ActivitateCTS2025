package main;

import clase.Masina;
import clase.Vehicul;
import factory.TipVehicul;
import factory.VehiculFactory;
import registry.RegistruVehicule;

public class Main {
    public static void main(String[] args) {
        VehiculFactory factory = VehiculFactory.getInstance();
        Vehicul masina = factory.creazaVehicul(TipVehicul.MASINA, "Popa Ion", "B-123-KMK");
        ((Masina)masina).setMarca("BMV");
        masina.descrieVehicul();

        Vehicul tir = factory.creazaVehicul(TipVehicul.TIR, "Popa Laurentiu", "B-156-MLK");
        tir.descrieVehicul();

        Vehicul motocicleta = factory.creazaVehicul(TipVehicul.MOTOCICLETA, "Radu Marian", "B-591-SMA");
        motocicleta.descrieVehicul();

        RegistruVehicule registru = RegistruVehicule.getInstance();
        Vehicul masinaRegistru = registru.getVehicul("B-100-EMM", "Manea Ioan", TipVehicul.MASINA);
        masinaRegistru.descrieVehicul();
    }
}
