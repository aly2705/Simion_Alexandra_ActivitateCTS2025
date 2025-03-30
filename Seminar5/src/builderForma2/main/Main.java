package builderForma2.main;

import builderForma2.clase.Pacient;
import builderForma2.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setArePapuci(true).setAreHalat(true);

        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Iris").build("Ioana");
        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Irina").build("Maria");
        Pacient pacient3 = pacientBuilder.setNumeInsotitor("Mihai").build("Andrei");

        System.out.println(pacient1);
        System.out.println(pacient2);
        System.out.println(pacient3);
    }
}
