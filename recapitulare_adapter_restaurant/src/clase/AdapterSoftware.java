package clase;

import java.util.List;

public class AdapterSoftware extends SoftBar implements ISoftRestaurant{
    public AdapterSoftware() {
        super();
    }

    @Override
    public void printeazaFactura(List<String> produse, double total) {
        super.proceseazaComanda(produse, total);
    }
}
