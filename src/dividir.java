/**
 * Operacion de division.
 * Programa que se encarga de realizar operaciones de division.
 * @author Pedro Cruz
 * @version 0.1
 */
public class dividir {

    private double num1;
    private double num2;

    /**
     * Constructor de la clase dividir.
     * Este metodo se encarga de dar valores al objeto que realizara la operacion.
     * @param num1 Es el dividendo de la operacion.
     * @param num2 Es el divisor de la operacion.
     */
    public dividir(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
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
