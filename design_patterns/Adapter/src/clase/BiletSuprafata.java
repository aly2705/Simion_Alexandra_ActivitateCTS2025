package clase;

public class BiletSuprafata implements TitluCalatorie {
    public int nrCalatoriiRamase;

    public BiletSuprafata(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void valideazaCalatorie() {
        if(nrCalatoriiRamase > 0){
            System.out.println("Validare reusita");
            nrCalatoriiRamase--;
        }else {
            System.out.println("Cont 0");
        }
    }
}
