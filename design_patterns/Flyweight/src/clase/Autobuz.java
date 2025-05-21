package clase;

public class Autobuz {
    private String nrInmaticulare;
    private String modelAutobuz;
    private int nrLocuri;
    private int anFabricatie;

    public Autobuz(String nrInmaticulare, String modelAutobuz, int nrLocuri, int anFabricatie) {
        this.nrInmaticulare = nrInmaticulare;
        this.modelAutobuz = modelAutobuz;
        this.nrLocuri = nrLocuri;
        this.anFabricatie = anFabricatie;
    }

    public String getNrInmaticulare() {
        return nrInmaticulare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrInmaticulare='").append(nrInmaticulare).append('\'');
        sb.append(", modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }
}
