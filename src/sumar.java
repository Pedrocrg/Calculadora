/**
 * Operacion de suma.
 * Programa que se encarga de realizar operaciones de suma.
 * @author Pedro Cruz
 * @version 0.1
 */
public class sumar {

    private double num1;
    private double num2;

    /**
     * Constructor de la clase sumar.
     * Este metodo se encarga de dar valores al objeto que realizara la operacion.
     * @param num1 Es el primer numero de la operacion.
     * @param num2 Es el segundo numero de la operacion.
     */
    public sumar(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    /**
     * Metodo para operar.
     * Este metodo se encarga de realizar la operacion de suma.
     * @param num1 Es el primer numero de la operacion.
     * @param num2 Es el segundo numero de la operacion.
     * @return Devuelve el resultado de una suma.
     */
    public static double suma(double num1, double num2){
        double result=num1+num2;
        return result;
    }
}
