package AdapterObiecte.clase;

public class MedicamentFarmacie {
    private String nume;
    private float pret;

    private boolean esteInStoc;

    public MedicamentFarmacie(String nume, float pret, boolean
                              esteInStoc) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        if(this.esteInStoc){
            System.out.println("Medicamentul " + this.nume + " a fost achizitonat la pretul de "+ pret);
        }else {
            System.out.println("Medicamentul " + this.nume + " nu este in stoc");
        }
    }
}
