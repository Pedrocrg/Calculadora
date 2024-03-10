import calculadora.Multiplicar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicarTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void multiplicacion() {
        double val1=5;
        double val2=5;
        double expResult = 25.0;
        double result = Multiplicar.multiplicacion(val1,val2);
        assertEquals(expResult, result);

        val1=7;
        val2=9;
        expResult = 63.0;
        result = Multiplicar.multiplicacion(val1,val2);
        assertEquals(expResult, result);

        val1=10;
        val2=3;
        expResult = 30.0;
        result = Multiplicar.multiplicacion(val1,val2);
        assertEquals(expResult, result);
    }
}