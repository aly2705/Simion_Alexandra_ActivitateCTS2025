package compositeSpital.main;

import compositeSpital.classes.Departament;
import compositeSpital.classes.Sectie;
import compositeSpital.classes.StructuraAbs;

public class Main {
    public static void main(String[] args) {

        StructuraAbs d1= new Departament("pediatrie", 10);
        StructuraAbs d2= new Departament("chirurgie", 3);


        StructuraAbs s1=new Sectie("estetica",1);
        StructuraAbs s2=new Sectie("ortopedica",3);
        StructuraAbs s3=new Sectie("boli",3);


        d1.adaugaNod(d2);
        d2.adaugaNod(s1);
        d2.adaugaNod(s2);
        d1.adaugaNod(s3);

        int nrangd1= d1.calcNrAngajati();
        System.out.println(nrangd1);

        d2.adaugaNod(s3);

        d1.afiseazaDesc(d1,"");
    }
}
