package clase;

public class ImplementareInternare extends TemplateInternare{

    @Override
    public void analizeazaStarePacient() {
        System.out.println("Se analizeaza starea pacientului");
    }

    @Override
    public void verificaDisponibilitateSaloane() {
        System.out.println("Se verifica disponibilitatea");
    }

    @Override
    public void emiteFisaInternare() {
        System.out.println("Se emite fisa de internare");
    }
}
