package ro.ase.clase;

public class AutoritatePescuitEager {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitEager instance = new AutoritatePescuitEager("ANPA", "anpa.ro", 100, 10000);

    private AutoritatePescuitEager(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static AutoritatePescuitEager getInstance(){
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void angajeaza(int nrAngajati){
        this.nrAngajati += nrAngajati;
    }

    public void concediaza(int nrAngajati){
        this.nrAngajati -= nrAngajati;
    }

    public void emiteAutorizatie(String nume){
        this.nrAutorizatiiEmise ++;
        System.out.println("A fost emisa autorizatie pentru "+nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
