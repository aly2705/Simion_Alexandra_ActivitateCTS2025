package clase;

public class Masina extends Vehicul {
    private String marca;

    public Masina(String nrInmaticulare, String numeProprietar, String marca) {
        super(nrInmaticulare, numeProprietar);
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("marca='").append(marca).append('\'');
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
