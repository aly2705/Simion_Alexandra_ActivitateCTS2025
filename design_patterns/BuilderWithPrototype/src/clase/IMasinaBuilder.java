package clase;

public interface IMasinaBuilder {
    IMasinaBuilder alegeMaterialeInterior(String materialeInterior);
    IMasinaBuilder alegeMaterialeScaune(String materialeScaune);
    IMasinaBuilder alegeMaterialeusi(String materialeUsi);
    IMasina build(String marca);
}
