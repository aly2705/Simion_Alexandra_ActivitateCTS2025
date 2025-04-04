package AdapterObiecte.clase;

public class AdapterMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicament;

    public AdapterMedicament(String nume, float pret, boolean esteInStoc) {
        super(nume, pret, esteInStoc);
    }

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(), true);
        this.medicament = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
