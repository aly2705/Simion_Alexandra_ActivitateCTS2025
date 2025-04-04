package AdapterClase.clase;

import AdapterObiecte.clase.MedicamentFarmacie;

public class Farmacie {
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia " +numeFarmacie +" ofera medicamentul " );
        medicamentFarmacie.cumparaMedicament();
    }

}
