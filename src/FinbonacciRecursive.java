public class FinbonacciRecursive {

    public static void main(String[] args){

        System.out.println(fibonacciCalc(8));

    }


    public static int fibonacciCalc(int number){

        if(number == 0) return 0;
        if(number == 1) return 1;

        int fibuX = fibonacciCalc(number-2);
        int fibuY = fibonacciCalc(number-1);

        int result = fibuX + fibuY;

        return result;
    }
}
