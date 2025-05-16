package clase;

import java.util.List;

public class SoftRestaurant implements ISoftRestaurant{


    @Override
    public void printeazaFactura(List<String> produse, double total) {
        System.out.println("Continut: ");
        for (String produs: produse){
            System.out.println("------" +produs+ "------");
        }
        System.out.println("Total: "+ total);
    }
}
