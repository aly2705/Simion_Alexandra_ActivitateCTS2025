package ro.ase.singletonRegistry;

import ro.ase.clase.AutoritatePescuitLazy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {
    private String denumire;
    private String website;
    private int nrAngajati;

    private static AutoritatePescuit instance = null;
    private static Map<String, Autorizatie> registry = new HashMap();

    private AutoritatePescuit(String denumire, String website, int nrAngajati) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    public static synchronized AutoritatePescuit getInstance(){
        if(instance==null){
            instance = new AutoritatePescuit("ANPA", "www.anpa.ro", 100);
        }
        return instance;
    }

    public static Autorizatie emiteAutorizatie(String numePersoana){
        if(!registry.containsKey(numePersoana)){
            registry.put(numePersoana, new Autorizatie(numePersoana,registry.size()+1, new Date().toString()));
        }
        return registry.get(numePersoana);
    }



}
