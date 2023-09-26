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
}
