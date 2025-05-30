package clase.teste;

import clase.Persoana;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GetSexTest {
    private String suffix;

    @Before
    public void setUp() throws Exception {
        this.suffix = "121212454545";
    }

    @Test
    public void getSexRight() {
        Persoana persoana = new Persoana("Ion Pop", "1"+suffix);
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexRight2() {
        Persoana persoana = new Persoana("Maria Pop", "2"+suffix);
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexBoundary() {
        Persoana persoana = new Persoana("Maria Pop", "8"+suffix);
        assertEquals("F", persoana.getSex());
    }
}