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
        double[] valores = {5,5,5};
        double expResult = 5.0;
        double result = sumar.suma(valores);
        assertEquals(expResult, result);

        valores[0]=7;
        valores[1]=9;
        valores[2]=8;
        expResult = 8.0;
        result = Main.calcularMedia(valores);
        assertEquals(expResult, result);

        valores = {5,5,5};
        expResult = 5.0;
        result = Main.calcularMedia(valores);
        assertEquals(expResult, result);
    }
}