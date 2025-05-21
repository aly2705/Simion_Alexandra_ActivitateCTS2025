package clase;

public class Facade {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public Facade() {
        this.usaFata = new Usa(TipUsa.FATA);
        this.usaMijloc = new Usa(TipUsa.MIJLOC);
        this.usaSpate = new Usa(TipUsa.SPATE);
    }

    public void deschideUsileFortat(){
        Buton butonDeschidereFortataUsa1 = new Buton(TipButon.ACTIONARE_FORTATA);
        this.usaFata.deschide(butonDeschidereFortataUsa1);

        Buton butonDeschidereFortataUsa2 = new Buton(TipButon.ACTIONARE_FORTATA);
        this.usaMijloc.deschide(butonDeschidereFortataUsa2);

        Buton butonDeschidereFortataUsa3 = new Buton(TipButon.ACTIONARE_FORTATA);
        this.usaSpate.deschide(butonDeschidereFortataUsa3);
    };

    public void deschideUsileInModLiber(){
        Buton butonDeschidereLiberaUsa1 = new Buton(TipButon.ACTIONARE_LIBERA);
        this.usaFata.deschide(butonDeschidereLiberaUsa1);

        Buton butonDeschidereLiberaUsa2 = new Buton(TipButon.ACTIONARE_LIBERA);
        this.usaMijloc.deschide(butonDeschidereLiberaUsa2);

        Buton butonDeschidereLiberaUsa3 = new Buton(TipButon.ACTIONARE_LIBERA);
        this.usaSpate.deschide(butonDeschidereLiberaUsa3);
    }
}
