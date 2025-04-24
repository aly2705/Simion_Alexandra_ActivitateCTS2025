package decoratorRestaurant.main;

import decoratorRestaurant.clase.INotaPlata;
import decoratorRestaurant.clase.NotaAnNou;
import decoratorRestaurant.clase.NotaCraciun;
import decoratorRestaurant.clase.NotaPlata;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> produse = new ArrayList<>();
        produse.add("Ciorba");
        produse.add("Papanasi");

        List<Double> preturi = new ArrayList<>();
        preturi.add(25.0);
        preturi.add(35.0);

        INotaPlata notaPlata = new NotaPlata(produse, preturi);
        notaPlata.printeaza();
        System.out.println();

        INotaPlata notaDecorata = new NotaAnNou(notaPlata);
        System.out.println();
        notaDecorata.printeaza();
        System.out.println();

        INotaPlata notaMultipluDecorata = new NotaCraciun(notaDecorata);
        System.out.println();
        notaMultipluDecorata.printeaza();
        System.out.println();
    }
}
