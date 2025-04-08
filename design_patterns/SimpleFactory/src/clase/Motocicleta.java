package clase;

public class Motocicleta extends  Vehicul{
    private int vitezaMaxima;

    public Motocicleta(String nrInmaticulare, String numeProprietar, int vitezaMaxima) {
        super(nrInmaticulare, numeProprietar);
        this.vitezaMaxima = vitezaMaxima;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motocicleta{");
        sb.append("vitezaMaxima=").append(vitezaMaxima);
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
