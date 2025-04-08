package registry;

import clase.Vehicul;
import factory.TipVehicul;
import factory.VehiculFactory;

import java.util.HashMap;
import java.util.Map;

public class RegistruVehicule {
    private static RegistruVehicule instance;
    private Map<String, Vehicul> registry;

    private RegistruVehicule() {
        registry=new HashMap<>();
    }

    public Vehicul getVehicul(String nrInmatriculare, String numeProprietar, TipVehicul tip){
        if(!registry.containsKey(nrInmatriculare)){
            Vehicul vehicul = VehiculFactory.getInstance().creazaVehicul(tip, numeProprietar, nrInmatriculare);
            registry.put(nrInmatriculare, vehicul);
        }
        return registry.get(nrInmatriculare);
    }

    public static RegistruVehicule getInstance(){
        if(instance==null){
            instance = new RegistruVehicule();
        }
        return instance;
    }
}
