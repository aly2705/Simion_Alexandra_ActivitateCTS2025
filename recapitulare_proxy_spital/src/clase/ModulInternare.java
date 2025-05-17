package clase;

public class ModulInternare implements IModulInternare {


    @Override
    public void internarePacient(String numePacient, boolean areAsigurare) {
        System.out.println("Se interneaza pacientul: "+ numePacient);
    }
}
