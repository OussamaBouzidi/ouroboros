public class TestA {

    public static void main(String[] args){
        /*
        System.out.println("     J      A    V     V     A");
        System.out.println("     J     A A    V   V     A A");
        System.out.println("J    J    AAAAA    V V     AAAAA");
        System.out.println(" J J     A     A    V     A     A");


        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newString = new StringBuffer(alphabet).reverse().toString();

        System.out.println(newString);



        String input = "WeAreSoBeautifuuuuul";

        char [] charArray = input.toCharArray();


        for(int i = charArray.length-1; i >= 0; i--){
            System.out.println(charArray[i]);
        }

       */


        double input = getRandomDoubleBetweenRange(10,30);
        System.out.println(input);


    }


    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1));
        return x;
    }

}
