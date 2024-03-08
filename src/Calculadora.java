// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.text.DecimalFormat;
import java.util.Scanner;
public class Calculadora {
    public static Scanner sc=new Scanner (System.in);
    public static DecimalFormat df = new DecimalFormat("#.000");
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
                    System.out.println(df.format(sumar.suma(num1,num2)));
                    break;
                case 2:
                    System.out.println(df.format(restar.resta(num1,num2)));
                    break;
                case 3:
                    System.out.println(df.format(multiplicar.multiplicacion(num1,num2)));
                    break;
                case 4:
                    System.out.println(df.format(dividir.division(num1,num2)));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Operación no disponible.");
            }
        }while(opcion!=0);
        System.out.println("Saliendo del programa...");
    }
}