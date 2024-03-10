/**
 * Operacion de multiplicacion.
 * Programa que se encarga de realizar operaciones de multiplicacion.
 * @author Pedro Cruz
 * @version 0.1
 */
public class multiplicar {

    private double num1;
    private double num2;

    /**
     * Constructor de la clase multiplicar.
     * Este metodo se encarga de dar valores al objeto que realizara la operacion.
     * @param num1 Es el primer numero de la operacion.
     * @param num2 Es el segundo numero de la operacion.
     */
    public multiplicar(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    /**
     * Metodo para operar.
     * Este metodo se encarga de realizar la operacion de multiplicacion.
     * @param num1 Es el primer numero de la operacion.
     * @param num2 Es el segundo numero de la operacion.
     * @return Devuelve el resultado de una multiplicacion.
     */
    public static double multiplicacion(double num1, double num2){
        double result=num1*num2;
        return result;
    }
}
