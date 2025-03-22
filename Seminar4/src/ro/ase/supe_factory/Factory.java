package ro.ase.supe_factory;

public class Factory {
    private int gramaj;
    private double pretSutaGrame;

    public Factory(int gramaj, double pretSutaGrame) {
        this.gramaj = gramaj;
        this.pretSutaGrame = pretSutaGrame;
    }

    public Supa getSupa(TipuriSupe supe, String ingrediente, int extraSupa){
        switch(supe){
            case CIUPERCI:
                return new SupaCiuperci(this.gramaj,this.pretSutaGrame, ingrediente, extraSupa);
            case VITA:
                return new SupaVita(this.gramaj, this.pretSutaGrame, ingrediente, extraSupa);
            case LEGUME:
                return new SupaLegume(this.gramaj, this.pretSutaGrame, ingrediente, extraSupa);
            default:
                return null;
        }
    }
}
