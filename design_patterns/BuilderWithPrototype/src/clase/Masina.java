package clase;

public class Masina implements IMasina, MasinaPrototype {
    private String marca;
    private String materialeInterior;
    private String materialeScaune;
    private String materialeUsi;

    public Masina() {
        this.marca = "";
        this.materialeInterior = "";
        this.materialeScaune = "";
        this.materialeUsi = "";
    }

    public Masina(String marca, String materialeInterior, String materialeScaune, String materialeUsi) {
        this.marca = marca;
        this.materialeInterior = materialeInterior;
        this.materialeScaune = materialeScaune;
        this.materialeUsi = materialeUsi;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setMaterialeInterior(String materialeInterior) {
        this.materialeInterior = materialeInterior;
    }

    void setMaterialeScaune(String materialeScaune) {
        this.materialeScaune = materialeScaune;
    }

    void setMaterialeUsi(String materialeUsi) {
        this.materialeUsi = materialeUsi;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getDotari() {
        StringBuilder sb = new StringBuilder();
        sb.append(materialeInterior).append(",").append(materialeUsi).append(",").append(materialeScaune);
        return sb.toString();
    }

    @Override
    public IMasina cloneaza() {
        Masina clona = new Masina();
        clona.marca = this.marca;
        clona.materialeInterior = this.materialeInterior;
        clona.materialeScaune = this.materialeScaune;
        clona.materialeUsi = this.materialeUsi;
        return clona;
    }
}
