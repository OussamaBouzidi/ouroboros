public class FactorialOfNumber {



    public static void main(String [] args){

        factorialNumber(5);
        System.out.println(factorialNum(5));
    }



    //factorial method with a iteration!
    public static void factorialNumber(int number){

        int result = 1;

        for(int i = 2; i <= number; i++){

            result *= i;

        }

        System.out.println(result);
    }


    public static int factorialNum(int number){



        if(number == 0) return 1;

        int x = factorialNum(number-1);

        int result = number * x;

        return result;
    }
}
