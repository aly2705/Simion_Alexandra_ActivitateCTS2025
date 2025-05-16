package clase;

public class Medic {
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public Boolean confirmaInternare(String starePacient){
        if(starePacient.equals("grava") || starePacient.equals("investigare urgenta")){
            return true;
        }

        return false;
    }
}
