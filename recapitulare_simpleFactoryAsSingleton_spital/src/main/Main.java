package main;

import personalFactory.PersonalFactory;
import personalFactory.PersonalSpital;
import personalFactory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        PersonalFactory factory = PersonalFactory.getInstance();

        PersonalSpital medic = factory.getPersonal(TipPersonal.MEDIC, "Dr. Ioan Mihai", 10000);
        medic.descrieRol();

        PersonalSpital asistent = factory.getPersonal(TipPersonal.ASISTENT, "Asis. Nan Madalina", 5000);
        asistent.descrieRol();

        PersonalFactory factory2 = PersonalFactory.getInstance();
        PersonalSpital brancardier = factory2.getPersonal(TipPersonal.BRANCARDIER, "Pop Mihnea", 4500);

        brancardier.descrieRol();

        System.out.println(factory.getPersonalCreat());
        System.out.println(factory2.getPersonalCreat());
    }
}
