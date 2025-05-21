package clase;

public class MedicSpecialist extends Handler{

    @Override
    public void preiaSolicitare(TipProblema tipProblema) {
        if (tipProblema == TipProblema.COMPLEXA){
            System.out.println("Va prelua un medic specialist");
        } else {
            this.urmatorul.preiaSolicitare(tipProblema);
        }
    }
}
