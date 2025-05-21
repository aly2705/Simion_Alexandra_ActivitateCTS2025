package clase;

public class Usa {
    private TipUsa tipUsa;

    public Usa(TipUsa tipUsa) {
        this.tipUsa = tipUsa;
    }

    public void deschide(Buton buton) {
        System.out.println("----- ATENTIE -----");
        buton.apasa();
        switch (tipUsa) {
            case FATA: {
                System.out.println("Deschidere usa din fata");
                break;
            }

            case MIJLOC: {
                System.out.println("Deschidere usa din mijloc");
                break;
            }

            case SPATE: {
                System.out.println("Deschidere usa din spate");
                break;
            }
        }
        System.out.println("-----------------");
    }
}
