package clase;

import java.util.ArrayList;
import java.util.List;

public class RetetaMedicament extends AbstractRetetaMedicament {
    private Boolean doarCuPrescriptie;

    public RetetaMedicament() {
        super();
        this.doarCuPrescriptie = false;
    }

    public RetetaMedicament(String substantaActiva, int cantitateSubstantaActiva, String nume, List<String> alteSubstante, List<Integer> cantitatiSubtante, Boolean doarCuPrescriptie) {
        super(substantaActiva, cantitateSubstantaActiva, nume, alteSubstante, cantitatiSubtante);
        this.doarCuPrescriptie = doarCuPrescriptie;
    }

    @Override
    public AbstractRetetaMedicament clone() {
        AbstractRetetaMedicament r = new RetetaMedicament();
        r.nume = this.nume;
        r.substantaActiva = this.substantaActiva;
        r.cantitateSubstantaActiva = this.cantitateSubstantaActiva;
        r.alteSubstante = new ArrayList<>();
        r.cantitatiSubtante = new ArrayList<>();
        for(int i=0; i<this.alteSubstante.size();i++){
            r.alteSubstante.add(this.alteSubstante.get(i));
            r.cantitatiSubtante.add(this.cantitatiSubtante.get(i));
        }


        return r;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaMedicament{");
        sb.append("doarCuPrescriptie=").append(doarCuPrescriptie);
        sb.append(", substantaActiva='").append(substantaActiva).append('\'');
        sb.append(", cantitateSubstantaActiva=").append(cantitateSubstantaActiva);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", alteSubstante=").append(alteSubstante);
        sb.append(", cantitatiSubtante=").append(cantitatiSubtante);
        sb.append('}');
        return sb.toString();
    }
}
