package clase;

public class Buton {
    private TipButon tip;

    public Buton(TipButon tip) {
        this.tip = tip;
    }

    public void apasa(){
        if(tip == TipButon.ACTIONARE_LIBERA){
            System.out.println("Se deschide in modul liber");
        }else {
            System.out.println("Se deschide in mod fortat");
        }
    }
}
