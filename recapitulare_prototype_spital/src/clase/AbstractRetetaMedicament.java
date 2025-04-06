package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRetetaMedicament {
    protected static int pragSubstantaActiva = 500;
    protected String substantaActiva;
    protected int cantitateSubstantaActiva;
    protected String nume;
    protected List<String> alteSubstante;
    protected List<Integer> cantitatiSubtante;

    public AbstractRetetaMedicament() {
        this.nume = "";
        this.substantaActiva = "";
        this.cantitateSubstantaActiva = 0;
        this.alteSubstante = null;
        this.cantitatiSubtante = null;
    }

    public AbstractRetetaMedicament(String substantaActiva, int cantitateSubstantaActiva, String nume, List<String> alteSubstante, List<Integer> cantitatiSubtante) {
        this.nume = nume;

        this.substantaActiva = substantaActiva;
        if(cantitateSubstantaActiva < pragSubstantaActiva){
            this.cantitateSubstantaActiva = cantitateSubstantaActiva;
        } else {
            this.cantitateSubstantaActiva = 10;
        }

        this.alteSubstante = new ArrayList<>();
        this.cantitatiSubtante = new ArrayList<>();

        for(int i=0; i<alteSubstante.size();i++){
            this.alteSubstante.add(alteSubstante.get(i));
            this.cantitatiSubtante.add(cantitatiSubtante.get(i));
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRetetaMedicament{");
        sb.append("substantaActiva='").append(substantaActiva).append('\'');
        sb.append(", cantitateSubstantaActiva=").append(cantitateSubstantaActiva);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", alteSubstante=").append(alteSubstante);
        sb.append(", cantitatiSubtante=").append(cantitatiSubtante);
        sb.append('}');
        return sb.toString();
    }

    public abstract AbstractRetetaMedicament clone();
}
