package clase;

public abstract class OcupareMasaTemplate {
    private int numarMasa;

    public OcupareMasaTemplate(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public abstract void curatareMasa();
    public abstract void asezareServetele();
    public abstract void asezareTacamuri();
    public abstract void invitaClienti();

    public final void ocupaMasa(){
        this.curatareMasa();
        this.asezareServetele();
        this.asezareTacamuri();
        this.invitaClienti();
    }

    public int getNumarMasa() {
        return numarMasa;
    }
}
