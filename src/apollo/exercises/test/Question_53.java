public class Question_53 {
    private static void m1() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {

        //What will be the result of compiling and executing Test class?

        try {
            m1();
        } finally {
            System.out.println("A");
        }
    }
}
