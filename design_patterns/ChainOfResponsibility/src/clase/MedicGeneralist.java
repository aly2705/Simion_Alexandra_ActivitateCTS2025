package clase;

public class MedicGeneralist extends Handler{
    @Override
    public void preiaSolicitare(TipProblema tipProblema) {
        if (tipProblema == TipProblema.MODERATA){
            System.out.println("Va prelua un medic generalist");
        } else {
            this.urmatorul.preiaSolicitare(tipProblema);
        }
    }
}
