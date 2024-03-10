import calculadora.Sumar;

import static org.junit.jupiter.api.Assertions.*;

class SumarTest {

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
        double result = Sumar.suma(val1,val2);
        assertEquals(expResult, result);

        val1=7;
        val2=9;
        expResult = 16.0;
        result = Sumar.suma(val1, val2);
        assertEquals(expResult, result);

        val1=10;
        val2=3;
        expResult = 13.0;
        result = Sumar.suma(val1, val2);
        assertEquals(expResult, result);
    }
}