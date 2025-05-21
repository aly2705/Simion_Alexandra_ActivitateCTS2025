package main;

import clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade modulActiuneUsi = new Facade();

        modulActiuneUsi.deschideUsileFortat();
        System.out.println();
        modulActiuneUsi.deschideUsileInModLiber();
    }
}
