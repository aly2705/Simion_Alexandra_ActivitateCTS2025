package clase;

public class AutobuzProxy implements IAutobuz{
    private IAutobuz autobuz;

    public AutobuzProxy(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(String numeStatie, int nrPersoaneStatie) {
        if(nrPersoaneStatie > 0){
            this.autobuz.opresteInStatie(numeStatie, nrPersoaneStatie);
        } else{
            System.out.println("Autobuzul nu opreste! Nu sunt persoane in statia "+ numeStatie);
        }

    }
}
