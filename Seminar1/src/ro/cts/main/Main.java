package ro.cts.main;

import ro.cts.model.personal.*;
import ro.cts.model.platforma.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Student> studentList=new ArrayList<>() ;
       studentList.add(new Student("Popescu", 21, 1, 2));
       studentList.add(new Student("Ionescu", 21, 2, 2));

        IPredabil profesor=new Profesor("Gigel", 38, 1, 12);

        Curs curs = new Curs("CTS ", studentList, profesor);
        curs.sustinereExam();

        IPredabil asistent=new Asistent("Marinel ",26,2,3);
        curs.setCadruDidactic(asistent);
        curs.sustinereExam();
        ((Persoana)curs.getCadruDidactic()).afiseazaModInvatare();

    }
}