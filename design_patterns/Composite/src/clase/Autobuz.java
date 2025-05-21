package clase;

import javax.naming.OperationNotSupportedException;

public class Autobuz implements Structura {
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descrie(String tab) {
        StringBuilder sb = new StringBuilder(tab);
        sb.append("[Autobuz] Producator: ").append(producator).append(", Model: ").append(model).append(", Locuri: ").append(nrLocuri);
        System.out.println(sb);
    }

    @Override
    public void adaugaNod(Structura structura) {
        throw new UnsupportedOperationException("Operatia nu e suportata");
    }

    @Override
    public void stergereNod(Structura structura) {
        throw new UnsupportedOperationException("Operatia nu e suportata");
    }

    @Override
    public Structura getNod(int index) {
        throw new UnsupportedOperationException("Operatia nu e suportata");
    }
}
