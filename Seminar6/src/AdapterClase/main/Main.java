package AdapterClase.main;

import AdapterClase.clase.Farmacie;
import AdapterClase.clase.IMedicamentFarmacie;
import AdapterClase.clase.MedicamentFarmacie;
import AdapterClase.clase.AdapterMedicament;
import AdapterClase.clase.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen 400mg", 32, true);

        farmacie.vindeMedicament(medicamentFarmacie);

        AdapterMedicament adapterMedicamentSpital = new AdapterMedicament("Antibiotic 1", 100);
        farmacie.vindeMedicament(adapterMedicamentSpital);
    }
}
