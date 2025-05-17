package clase;

public class ProxyModulInternare implements IModulInternare{
    private IModulInternare modulInternare;

    public ProxyModulInternare(IModulInternare modulInternare) {
        this.modulInternare = modulInternare;
    }

    @Override
    public void internarePacient(String numePacient, boolean areAsigurare) {
        if (areAsigurare) {
            this.modulInternare.internarePacient(numePacient, areAsigurare);
        } else {
            System.out.println("Pacientul nu are asigurare si nu poate fi internat");
        }
    }
}
