package calculadora;

/**
 * Operacion de suma.
 * Programa que se encarga de realizar operaciones de suma.
 * @author Pedro Cruz
 * @version 0.1
 */
public class Sumar {

    /**
     * Constructor de la clase sumar.
     * Metodo para informar de la funcion de la clase.
     * @throws IllegalStateException Mensaje que informa de para que sirve la clase.
     */
    private Sumar() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     * Metodo para operar.
     * Este metodo se encarga de realizar la operacion de suma.
     * @param num1 Es el primer numero de la operacion.
     * @param num2 Es el segundo numero de la operacion.
     * @return Devuelve el resultado de una suma.
     */
    public static double suma(double num1, double num2){
        return num1+num2;
    }
}
