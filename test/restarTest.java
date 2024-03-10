import calculadora.Restar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestarTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void resta() {
        double val1=5;
        double val2=5;
        double expResult = 0.0;
        double result = Restar.resta(val1,val2);
        assertEquals(expResult, result);

        val1=7;
        val2=9;
        expResult = -2.0;
        result = Restar.resta(val1,val2);
        assertEquals(expResult, result);

        val1=10;
        val2=3;
        expResult = 7.0;
        result = Restar.resta(val1,val2);
        assertEquals(expResult, result);
    }
}