package AdapterClase.clase;

import AdapterObiecte.clase.MedicamentSpital;

public class AdapterMedicament extends MedicamentSpital implements IMedicamentFarmacie {
    public AdapterMedicament(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
