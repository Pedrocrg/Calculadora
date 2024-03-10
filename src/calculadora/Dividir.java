package calculadora;

/**
 * Operacion de division.
 * Programa que se encarga de realizar operaciones de division.
 * @author Pedro Cruz
 * @version 0.1
 */
public class Dividir {

    /**
     * Constructor de la clase dividir.
     * Metodo para informar de la funcion de la clase.
     * @throws IllegalStateException Mensaje que informa de para que sirve la clase.
     */
    private Dividir() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     * Metodo para operar.
     * Este metodo se encarga de realizar la operacion de division.
     * @param num1 Es el dividendo de la operacion.
     * @param num2 Es el divisor de la operacion.
     * @return Devuelve el cociente de una division.
     */
    public static double division(double num1, double num2){
        double result;
        if (num2==0) {
            result = 0;
        }else{
            result=num1/num2;
        }
        return result;
    }
}
