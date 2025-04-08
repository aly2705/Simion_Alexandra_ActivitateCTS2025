package clase;

public class Tir extends Vehicul{
    private double inaltime;

    public Tir(String nrInmaticulare, String numeProprietar, double inaltime) {
        super(nrInmaticulare, numeProprietar);
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tir{");
        sb.append("inaltime=").append(inaltime);
        sb.append(", nrInmaticulare='").append(nrInmaticulare).append('\'');
        sb.append(", numeProprietar='").append(numeProprietar).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descrieVehicul() {
        System.out.println(this.toString());
    }
}
