package clase;

public class Asistent extends Handler{

    @Override
    public void preiaSolicitare(TipProblema tipProblema) {
        if (tipProblema == TipProblema.MINORA){
            System.out.println("Se ocupa asistentul");
        } else {
            this.urmatorul.preiaSolicitare(tipProblema);
        }

    }
}
