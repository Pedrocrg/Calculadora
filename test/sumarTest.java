import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumarTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void suma() {
        double val1=5;
        double val2=5;
        double expResult = 10.0;
        double result = sumar.suma(val1,val2);
        assertEquals(expResult, result);

        val1=7;
        val2=9;
        expResult = 16.0;
        result = sumar.suma(val1, val2);
        assertEquals(expResult, result);

        val1=10;
        val2=3;
        expResult = 13.0;
        result = sumar.suma(val1, val2);
        assertEquals(expResult, result);
    }
}