package main;

import clase.IMasina;
import clase.MasinaBuilder;

public class Service {
    public static void main(String[] args) {
        MasinaBuilder builder = new MasinaBuilder();

        IMasina masina = builder.alegeMaterialeInterior("piele").alegeMaterialeusi("tapiterie speciala").build("Toyota");
        System.out.println(masina.getMarca());
        System.out.println(masina.getDotari());

        IMasina masina2 = builder.alegeMaterialeInterior("piele").alegeMaterialeusi("piele").alegeMaterialeScaune("piele").build("BMV");
        System.out.println(masina2.getMarca());
        System.out.println(masina2.getDotari());

    }
}
