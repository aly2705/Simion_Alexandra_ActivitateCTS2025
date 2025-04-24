package facadeRestaurant.main;

import facadeRestaurant.clase.Facade;
import facadeRestaurant.clase.Masa;
import facadeRestaurant.clase.Ospatar;
import facadeRestaurant.clase.Picolo;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, false);
        Masa masa2 = new Masa(2, true);
        Masa masa3 = new Masa(3, true);
        Masa masa4 = new Masa(4, true);

        Facade facade = new Facade();
        System.out.println(facade.verificaAsezareMasa(masa1));
        System.out.println(facade.verificaAsezareMasa(masa2));
        System.out.println(facade.verificaAsezareMasa(masa3));
        System.out.println(facade.verificaAsezareMasa(masa4));
    }
}
