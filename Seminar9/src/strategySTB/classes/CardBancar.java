package strategySTB.classes;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(sold >= pretBilet){
            sold -= pretBilet;
            System.out.println("S-a platit cu cardul bancar");
        }else {
            System.out.println("Sold insuficient");
        }
    }
}
