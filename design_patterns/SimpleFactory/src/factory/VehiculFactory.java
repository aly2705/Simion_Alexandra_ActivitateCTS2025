package factory;

import clase.Masina;
import clase.Motocicleta;
import clase.Tir;
import clase.Vehicul;

public class VehiculFactory {
    private static VehiculFactory instance;

    private VehiculFactory() {
    }

    public static VehiculFactory getInstance(){
        if(instance==null){
            instance = new VehiculFactory();
        }
        return instance;
    }

    public Vehicul creazaVehicul(TipVehicul tip, String numeProprietar, String nrInmatriculare){
        return switch (tip){
            case TIR -> new Tir(nrInmatriculare, numeProprietar, 2.5);
            case MASINA -> new Masina(nrInmatriculare, numeProprietar, "Toyota");
            case MOTOCICLETA -> new Motocicleta(nrInmatriculare,numeProprietar, 280);
            default -> null;
        };
    }
}
