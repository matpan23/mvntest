import it.unisa.mpanza.Calcolatrice;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalcolatriceTest {
    Calcolatrice calcolatrice;

    public final void setUp() {
        calcolatrice = new Calcolatrice();
    }
    public void TestSomma() {
        assertTrue(calcolatrice.Somma(11,1)==12, "somma corretta");
    }
    public void TestMoltiplicazione() {
        assertTrue(calcolatrice.Moltiplicazione(10,2)==20, "moltiplicazione corretta");
    }
    public void TestDivisione() {
        assertTrue(calcolatrice.Division(10,2)==5, "divisione corretta");
    }
    public void TestSottrazione() {
        assertTrue(calcolatrice.Sottrazione(22,2)==20, "sottrazione corretta");
    }
}
