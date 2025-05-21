package clase;

public class BiletMetrou extends TitluCalatorieMetrou{
    private int nrCalatorii;

    public BiletMetrou(String titular, int nrCalatorii) {
        super(titular);
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void valideazaIntrareMetrou() {
        if(nrCalatorii>0){
            System.out.println("Validata! Calatorie placuta");
            nrCalatorii--;
        }
    }
}
