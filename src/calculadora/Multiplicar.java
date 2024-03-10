package calculadora;

/**
 * Operacion de multiplicacion.
 * Programa que se encarga de realizar operaciones de multiplicacion.
 * @author Pedro Cruz
 * @version 0.1
 */
public class Multiplicar {

    /**
     * Constructor de la clase multiplicar.
     * Metodo para informar de la funcion de la clase.
     * @throws IllegalStateException Mensaje que informa de para que sirve la clase.
     */
    private Multiplicar() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     * Metodo para operar.
     * Este metodo se encarga de realizar la operacion de multiplicacion.
     * @param num1 Es el primer numero de la operacion.
     * @param num2 Es el segundo numero de la operacion.
     * @return Devuelve el resultado de una multiplicacion.
     */
    public static double multiplicacion(double num1, double num2){
        return num1*num2;
    }
}
