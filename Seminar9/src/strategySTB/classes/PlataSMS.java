package strategySTB.classes;

public class PlataSMS implements IMetodaPlata{

    public PlataSMS() {
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("S-a platit prin SMS");
    }
}
