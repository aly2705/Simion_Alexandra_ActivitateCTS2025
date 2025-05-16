package clase;

import java.util.List;

public class SoftBar {
    private int totalBauturiComandate;

    public SoftBar() {
        totalBauturiComandate = 0;
    }

    public void contorizareBauturi(int nrBauturi){
        totalBauturiComandate+=nrBauturi;
    }

    public int getTotalBauturiComandate() {
        return totalBauturiComandate;
    }

    public void proceseazaComanda(List<String> produse, double total) {
        this.contorizareBauturi(produse.size());
        System.out.println("Factura Bar: ");
        for (String produs: produse){
            System.out.println("Bautura - " +produs);
        }
        System.out.println("Total: "+ total);
    }
}
