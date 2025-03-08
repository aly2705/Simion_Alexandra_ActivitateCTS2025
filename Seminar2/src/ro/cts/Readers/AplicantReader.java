package ro.cts.Readers;

import ro.cts.Clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    protected String file;

    public AplicantReader(String file) {
        this.file = file;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    protected void readAplicantData(Scanner input, Aplicant aplicant){
        aplicant.setNume(input.next());
        aplicant.setPrenume(input.next());
        aplicant.setVarsta(input.nextInt());
        aplicant.setPunctaj(input.nextInt());
        int nr = input.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        aplicant.setDenumireProiect(nr, vect);
    }
}
