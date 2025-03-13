package ro.ase.Main;

import ro.ase.singletonRegistry.AutoritatePescuit;
import ro.ase.singletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance();
        Autorizatie autorizatie = autoritatePescuit.emiteAutorizatie("Popa Ion");
        System.out.println(autorizatie);

        Autorizatie autorizatie2 = autoritatePescuit.emiteAutorizatie("Popa Ion");
        System.out.println(autorizatie2);
    }
}