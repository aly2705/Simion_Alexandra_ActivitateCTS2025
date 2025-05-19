package clase;

public class GestiuneMasa extends OcupareMasaTemplate{

    public GestiuneMasa(int numarMasa) {
        super(numarMasa);
    }

    @Override
    public void curatareMasa() {
        System.out.println("[Masa "+getNumarMasa()+"] Se realizeaza curatenia");
    }

    @Override
    public void asezareServetele() {
        System.out.println("[Masa "+getNumarMasa()+"] Se asaza servetelele");
    }

    @Override
    public void asezareTacamuri() {
        System.out.println("[Masa "+getNumarMasa()+"] Se asaza tacamurile");
    }

    @Override
    public void invitaClienti() {
        System.out.println("[Masa "+getNumarMasa()+"] Masa e gata, se invita clientii!");
    }
}
