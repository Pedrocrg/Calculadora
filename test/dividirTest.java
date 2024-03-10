import calculadora.Dividir;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void division() {
        double val1=5;
        double val2=0;
        double expResult = 0.0;
        double result = Dividir.division(val1,val2);
        assertEquals(expResult, result, 0.3);

        val1=7;
        val2=9;
        expResult = 0.777;
        result = Dividir.division(val1,val2);
        assertEquals(expResult, result,0.3);

        val1=10;
        val2=3;
        expResult = 3.333;
        result = Dividir.division(val1,val2);
        assertEquals(expResult, result,0.001);
    }
}