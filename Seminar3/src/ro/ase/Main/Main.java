package ro.ase.Main;

import ro.ase.clase.AutoritatePescuitEager;
import ro.ase.clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager.angajeaza(10);
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setDenumire("ANpPA");
        autoritatePescuitEager.setWebsite("www.anppa.ro");

        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.emiteAutorizatie("Popa Ion");

        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager2 = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager2.emiteAutorizatie("Adi");
        System.out.println(autoritatePescuitEager2.toString());


        AutoritatePescuitLazy autoritatePescuitLazy = AutoritatePescuitLazy.getInstance("ANPA", "anpa.ro", 100, 10000);
        AutoritatePescuitLazy autoritatePescuitLazy2 = AutoritatePescuitLazy.getInstance("ANpPA", "www.anpa.ro", 80, 18000);
        autoritatePescuitLazy2.angajeaza(5);
        System.out.println(autoritatePescuitLazy2.toString());
    }
}