package personalFactory;

public class Brancardier extends PersonalSpital {
    private String zonaResponsabilitate;

    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
        this.zonaResponsabilitate = "Aripa B";
    }

    @Override
    public void descrieRol() {
        System.out.println("Ocupatie: transportul pacientilor in siguranta. Zona de responsabilitate: "+ zonaResponsabilitate);
    }
}
