package main;

import clase.ModulPlata;
import clase.PlataCard;
import clase.PlataCash;
import clase.StrategiePlata;

public class Main {
    public static void main(String[] args) {
        StrategiePlata plataCash = new PlataCash();
        StrategiePlata plataCard = new PlataCard();

        ModulPlata modulPlata = new ModulPlata(plataCard);
        modulPlata.incaseaza(230);

        modulPlata.setStrategiePlata(plataCash);
        modulPlata.incaseaza(580);
    }
}
