package AdapterObiecte.farmacieMain;

import AdapterObiecte.clase.AdapterMedicament;
import AdapterObiecte.clase.MedicamentFarmacie;
import AdapterObiecte.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia ofera medicamentul " );
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
       MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen 400mg", 32, true);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Parasinus Penta", 32, true);
        vindeMedicament(medicamentFarmacie);
        vindeMedicament(medicamentFarmacie2);


        MedicamentSpital medicamentSpital = new MedicamentSpital("Antibiotic 1", 100);
        MedicamentSpital medicamentSpital2 = new MedicamentSpital("Antibiotic 2", 80);

        vindeMedicament(new AdapterMedicament(medicamentSpital));
        vindeMedicament(new AdapterMedicament(medicamentSpital2));
    }
}