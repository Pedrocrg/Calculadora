package calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculadora de operaciones simples.
 * Programa que se encarga de realizar operaciones como una calculadora, incluyendo entre si
 * la multiplicacion, division, resta y suma.
 * @author Pedro Cruz
 * @version 0.1
 */
public class Calculadora {
    static final Scanner sc=new Scanner (System.in);
    static final DecimalFormat df = new DecimalFormat("#.000");
    private static final String RESULTADO="El resultado es: ";
    private static final String MARGEN="*****************************";
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        //Menu para la calculadora
        int opcion;
        double num1=0;
        double num2=0;
        do{
            System.out.println("La calculadora tiene las siguientes opciones:");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.print("¿Qué opción quiere realizar?: ");
            opcion=sc.nextInt();
            if (opcion>0&&opcion<5){
                System.out.print("Indique primer número: ");
                num1=sc.nextDouble();
                System.out.print("Indique segundo número: ");
                num2=sc.nextDouble();
            }
            switch (opcion){
                case 1:
                    System.out.println(MARGEN);
                    System.out.println(RESULTADO+df.format(Sumar.suma(num1,num2)));
                    System.out.println(MARGEN);
                    break;
                case 2:
                    System.out.println(MARGEN);
                    System.out.println(RESULTADO+df.format(Restar.resta(num1,num2)));
                    System.out.println(MARGEN);
                    break;
                case 3:
                    System.out.println(MARGEN);
                    System.out.println(RESULTADO+df.format(Multiplicar.multiplicacion(num1,num2)));
                    System.out.println(MARGEN);
                    break;
                case 4:
                    System.out.println(MARGEN);
                    System.out.println(RESULTADO+df.format(Dividir.division(num1,num2)));
                    System.out.println(MARGEN);
                    break;
                case 0:
                    break;
                default:
                    System.out.println(MARGEN);
                    System.out.println("Operación no disponible.");
                    System.out.println(MARGEN);
            }
        }while(opcion!=0);
        System.out.println("Saliendo del programa...");
    }
}