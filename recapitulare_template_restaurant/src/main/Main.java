package main;

import clase.GestiuneMasa;
import clase.OcupareMasaTemplate;

public class Main {
    public static void main(String[] args) {
        OcupareMasaTemplate masa1 = new GestiuneMasa(20);
        OcupareMasaTemplate masa2 = new GestiuneMasa(25);

        masa1.ocupaMasa();
        masa2.ocupaMasa();
    }
}
