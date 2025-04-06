package personalFactory;

import java.util.ArrayList;

public class PersonalFactory {
    private static PersonalFactory instance;
    private ArrayList<TipPersonal> personalCreat = new ArrayList<>();

    private PersonalFactory(){}

    public PersonalSpital getPersonal(TipPersonal tip, String nume, int salariu){
        personalCreat.add(tip);
        return switch (tip) {
            case ASISTENT -> new Asistent(nume, salariu);
            case MEDIC -> new Medic(nume, salariu);
            case BRANCARDIER -> new Brancardier(nume, salariu);
            default -> null;
        };
    }

    public static PersonalFactory getInstance() {
        if(instance == null){
            instance = new PersonalFactory();
        }
        return instance;
    }

    public ArrayList<TipPersonal> getPersonalCreat() {
        return personalCreat;
    }
}
