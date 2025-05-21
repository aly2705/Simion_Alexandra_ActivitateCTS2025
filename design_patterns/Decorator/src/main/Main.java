package main;

import clase.Bilet;
import clase.BiletDecoratZiuaNationala;
import clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet("Ana Maria", 10);
        bilet.printare();

        IBilet biletDecorat = new BiletDecoratZiuaNationala(bilet);
        biletDecorat.printare();
    }
}
