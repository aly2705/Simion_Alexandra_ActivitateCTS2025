package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, ILinieAutobuz> linii;

    public FlyweightFactory() {
        this.linii = new HashMap<>();
    }

    public ILinieAutobuz getLinie(Integer nrLinie, String primaStatie, String ultimaStatie){
        if(!linii.containsKey(nrLinie)){
            this.linii.put(nrLinie, new LinieAutobuz(nrLinie, primaStatie, ultimaStatie));
        }
        return linii.get(nrLinie);
    }

    public ILinieAutobuz getLinie(Integer nrLinie) throws Exception {
        if(!linii.containsKey(nrLinie)){
            throw new Exception("Nu exista linia!");
        }
        return linii.get(nrLinie);
    }
}
