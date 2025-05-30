package clase.teste;

import clase.Persoana;
import clase.exceptii.CNPInexistentException;
import clase.exceptii.CNPInvalidException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {
    private Persoana persoana;

    @Before
    public void setUp() throws Exception {
        this.persoana = new Persoana();
    }

    @Test
    public void getVarstaRight() {
        this.persoana = new Persoana("Ioana Popa", "60211104000000");
        assertEquals(22, persoana.getVarsta());
    }

    @Test
    public void getVarstaRight2() {
        this.persoana = new Persoana("Ion Popa", "19804104000000");
        assertEquals(27, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundary() {
        this.persoana = new Persoana("Ion Popa", "19912310400000");
        assertEquals(25, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundary2() {
        this.persoana = new Persoana("Ion Popa", "5000101400000");
        assertEquals(25, persoana.getVarsta());
    }

    @Test(expected = CNPInvalidException.class)
    public void getVarstaErrorCondition1(){
        this.persoana = new Persoana("Ion Popa", "5001301400000");
        this.persoana.getVarsta();
    }

    @Test(expected = CNPInvalidException.class)
    public void getVarstaErrorCondition2(){
        this.persoana = new Persoana("Ion Popa", "5001200400000");
        this.persoana.getVarsta();
    }

    @Test(expected = CNPInvalidException.class)
    public void getVarstaErrorCondition3(){
        this.persoana = new Persoana("Ion Popa", "5AA1201400000");
        this.persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance(){
        this.persoana = new Persoana("Ion Popa", "5001201400000");
        persoana.getVarsta();
    }

    @Test(expected = CNPInvalidException.class)
    public void getVarstaConform(){
        this.persoana = new Persoana("Ion Popa", "50012");
        this.persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder(){
        Persoana persoana1 = new Persoana("Ion Popa", "5001229121212");
        Persoana persoana2 = new Persoana("Ion Popa", "1981229121212");

        assertTrue(persoana2.getVarsta() > persoana1.getVarsta());
    }

    @Test(expected = CNPInexistentException.class)
    public void getVarstaExistance(){
        this.persoana = new Persoana("Maria", null);
        this.persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality0(){
        this.persoana = new Persoana("Ion Popa", "5250101121212");
        assertEquals(0,this.persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinality1(){
        this.persoana = new Persoana("Ion Popa", "5240101121212");
        assertEquals(1,this.persoana.getVarsta());
    }
}