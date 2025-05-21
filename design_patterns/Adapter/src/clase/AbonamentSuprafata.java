package clase;

public class AbonamentSuprafata implements TitluCalatorie{
    public String titular;
    private int valabilitateRamasa;

    public AbonamentSuprafata(String titular, int valabilitateRamasa) {
        this.titular = titular;
        this.valabilitateRamasa = valabilitateRamasa;
    }

    @Override
    public void valideazaCalatorie() {
        if(valabilitateRamasa > 0){
            System.out.println("Validare reusita");
        } else {
            System.out.println("Card expirat");
        }
    }
}
