package calculadora;

/**
 * Operacion de resta.
 * Programa que se encarga de realizar operaciones de resta.
 * @author Pedro Cruz
 * @version 0.1
 */
public class Restar {

    /**
     * Constructor de la clase restar.
     * Metodo para informar de la funcion de la clase.
     * @throws IllegalStateException Mensaje que informa de para que sirve la clase.
     */
    private Restar() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     * Metodo para operar.
     * Este metodo se encarga de realizar la operacion de resta.
     * @param num1 Es el primer numero de la operacion.
     * @param num2 Es el segundo numero de la operacion.
     * @return Devuelve el resultado de una resta.
     */
    public static double resta(double num1, double num2){
        return num1-num2;
    }
}
