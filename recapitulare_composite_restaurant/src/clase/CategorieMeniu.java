package clase;

import java.util.ArrayList;
import java.util.List;

public class CategorieMeniu extends OptiuneMeniu {
    private List<OptiuneMeniu> optiuni;

    public CategorieMeniu(String nume) {
        super(nume);
        this.optiuni = new ArrayList<>();
    }


    @Override
    public void adaugareNod(OptiuneMeniu optiune) {
        this.optiuni.add(optiune);
    }

    @Override
    public void stergereNod(OptiuneMeniu optiune) {
        this.optiuni.remove(optiune);
    }

    @Override
    public OptiuneMeniu getNod(int index) {
        return this.optiuni.get(index);
    }

    @Override
    public void afiseaza(String tab) {
        System.out.println(tab+getNume());
        for(OptiuneMeniu optiune: optiuni){
            optiune.afiseaza(tab+"      ");
        }
    }
}
