package main;

import clase.AdapterSoftware;
import clase.ISoftRestaurant;
import clase.SoftRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> comandaRestaurant = new ArrayList<>();
        comandaRestaurant.add("ciorba");
        comandaRestaurant.add("cheesecake");

        List<String> comandaBar = new ArrayList<>();
        comandaBar.add("limonada");
        comandaBar.add("vin rose");

        ISoftRestaurant softwareRestaurant = new SoftRestaurant();
        softwareRestaurant.printeazaFactura(comandaRestaurant, 60);

        AdapterSoftware softwareBar = new AdapterSoftware();
        softwareBar.printeazaFactura(comandaBar, 50);
        System.out.println("Total bauturi preparate la bar: "+ softwareBar.getTotalBauturiComandate());
    }
}
