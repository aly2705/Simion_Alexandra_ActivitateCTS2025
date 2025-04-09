package clase;

public class MasinaBuilder implements IMasinaBuilder{
    private String materialeInterior;
    private String materialeScaune;
    private String materialeUsi;
    private IMasina masinaPrototype = null;

    public MasinaBuilder() {
        materialeInterior = "materiale din fabrica";
        materialeScaune = "materiale din fabrica";
        materialeUsi = "materiale din fabrica";
        masinaPrototype = new Masina("N/A", materialeInterior, materialeScaune, materialeUsi);
    }

    @Override
    public IMasinaBuilder alegeMaterialeInterior(String materialeInterior) {
        this.materialeInterior = materialeInterior;
        return this;
    }

    @Override
    public IMasinaBuilder alegeMaterialeScaune(String materialeScaune) {
        this.materialeScaune = materialeScaune;
        return this;
    }

    @Override
    public IMasinaBuilder alegeMaterialeusi(String materialeUsi) {
        this.materialeUsi = materialeUsi;
        return this;
    }

    @Override
    public IMasina build(String marca) {
        Masina masina = (Masina) ((Masina)this.masinaPrototype).cloneaza();
        masina.setMarca(marca);
        masina.setMaterialeInterior(materialeInterior);
        masina.setMaterialeUsi(materialeUsi);

        return masina;
    }
}
