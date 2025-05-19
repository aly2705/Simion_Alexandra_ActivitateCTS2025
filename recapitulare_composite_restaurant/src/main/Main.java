package main;

import clase.CategorieMeniu;
import clase.ItemMeniu;
import clase.OptiuneMeniu;

public class Main {

    public static void main(String[] args) {
        OptiuneMeniu item1 = new ItemMeniu("Ciorba de pui", 25);
        OptiuneMeniu item2 = new ItemMeniu("Ciorba de burta", 30);

        OptiuneMeniu item3 = new ItemMeniu("Cartofi prajiti", 15);
        OptiuneMeniu item4 = new ItemMeniu("Piept de pui la gratar", 40);

        OptiuneMeniu item5 = new ItemMeniu("Apa plata", 10);
        OptiuneMeniu item6 = new ItemMeniu("Limonada", 30);

        OptiuneMeniu ciorbe = new CategorieMeniu("Ciorbe");
        ciorbe.adaugareNod(item1);
        ciorbe.adaugareNod(item2);

        OptiuneMeniu feluriPrincipale = new CategorieMeniu("Feluri principale");
        feluriPrincipale.adaugareNod(item3);
        feluriPrincipale.adaugareNod(item4);

        OptiuneMeniu racoritoare = new CategorieMeniu("Bauturi racoritoare");
        racoritoare.adaugareNod(item5);
        racoritoare.adaugareNod(item6);

        OptiuneMeniu mancare = new CategorieMeniu("Feluri de mancare");
        mancare.adaugareNod(ciorbe);
        mancare.adaugareNod(feluriPrincipale);

        OptiuneMeniu meniuIntreg = new CategorieMeniu("Meniu");
        meniuIntreg.adaugareNod(mancare);
        meniuIntreg.adaugareNod(racoritoare);

        meniuIntreg.afiseaza("");
    }
}
