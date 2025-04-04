package AdapterClase.clase;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Valoarea achizitiei (lei): "+ pret);
    }

    public void prezintaReteta() {
        System.out.println("Este prezentata retea pentru medicamentul: " + nume);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
