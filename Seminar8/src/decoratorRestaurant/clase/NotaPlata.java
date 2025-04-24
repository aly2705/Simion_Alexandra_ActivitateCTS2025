package decoratorRestaurant.clase;

import java.util.List;

public class NotaPlata implements INotaPlata{
    private List<String> produse;
    private List<Double> pretProduse;

    public NotaPlata(List<String> produse, List<Double> pretProduse) {
        this.produse = produse;
        this.pretProduse = pretProduse;
    }

    @Override
    public void printeaza() {
        double total = 0;
        for (int i=0; i<produse.size(); i++){
            System.out.println(produse.get(i) +"........."+pretProduse.get(i));
            total+=pretProduse.get(i);
        }
        System.out.println("Total: ........."+ total);
    }
}
