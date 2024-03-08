public class dividir {

    private double num1;
    private double num2;

    public dividir(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

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
