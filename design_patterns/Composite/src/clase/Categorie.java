package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Structura{
    private String nume;
    private List<Structura> componente;

    public Categorie(String nume) {
        this.nume = nume;
        this.componente = new ArrayList<>();
    }

    @Override
    public void descrie(String tab) {
        System.out.println(tab + nume);
        for(Structura s : componente){
            s.descrie(tab+"     ");
        }
    }

    @Override
    public void adaugaNod(Structura structura) {
        this.componente.add(structura);
    }

    @Override
    public void stergereNod(Structura structura) {
        this.componente.remove(structura);
    }

    @Override
    public Structura getNod(int index) {
        return this.componente.get(index);
    }
}
