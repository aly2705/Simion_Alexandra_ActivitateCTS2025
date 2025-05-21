package main;

import clase.InnoireAbonament;
import clase.StrategieDiscount;
import clase.StrategieDiscountElev;
import clase.StrategieDiscountStudent;

public class Main {
    public static void main(String[] args) {
        StrategieDiscount elev = new StrategieDiscountElev();
        StrategieDiscount student = new StrategieDiscountStudent();

        InnoireAbonament abonament = new InnoireAbonament(30, 80);
        abonament.afiseazaTotalPlata();

        abonament.setStrategieDiscount(elev);
        abonament.afiseazaTotalPlata();

        abonament.setStrategieDiscount(student);
        abonament.afiseazaTotalPlata();
    }
}
