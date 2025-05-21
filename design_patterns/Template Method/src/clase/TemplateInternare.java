package clase;

public abstract  class TemplateInternare {
    public abstract void analizeazaStarePacient();
    public abstract void verificaDisponibilitateSaloane();
    public abstract void emiteFisaInternare();

    public void interneazaPacient(){
        analizeazaStarePacient();
        verificaDisponibilitateSaloane();
        emiteFisaInternare();
    }

}
