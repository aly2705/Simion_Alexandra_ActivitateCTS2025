package clase;

public class InnoireAbonament {
    private int zileValabilitate;
    private int pretStandard;
    private StrategieDiscount strategieDiscount;

    public InnoireAbonament(int zileValabilitate, int pretStandard) {
        this.zileValabilitate = zileValabilitate;
        this.pretStandard = pretStandard;
        this.strategieDiscount = new StrategieDiscountStandard();
    }

    public void setStrategieDiscount(StrategieDiscount strategieDiscount) {
        this.strategieDiscount = strategieDiscount;
    }

    public void afiseazaTotalPlata(){
        double pretFinal = pretStandard*(1 - strategieDiscount.calculeazaProcentDiscount());
        System.out.println("Total Plata: "+pretFinal);

    }
}
