public class Question_35 {

    //What will be the result of compiling and executing Test class?

    public static void main(String[] args) {
        m(1);
    }

    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }
}
