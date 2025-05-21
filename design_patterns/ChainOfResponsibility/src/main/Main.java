package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler asistent = new Asistent();
        Handler medicGeneralist = new MedicGeneralist();
        Handler medicSpecialist = new MedicSpecialist();
        Handler medicGarda = new MedicGarda();

        asistent.setUrmatorul(medicGeneralist);
        medicGeneralist.setUrmatorul(medicSpecialist);
        medicSpecialist.setUrmatorul(medicGarda);

        asistent.preiaSolicitare(TipProblema.URGENTA);
        asistent.preiaSolicitare(TipProblema.MODERATA);
        asistent.preiaSolicitare(TipProblema.COMPLEXA);
        asistent.preiaSolicitare(TipProblema.MINORA);
    }
}
