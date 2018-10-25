package apollo.exercises.ch01_output;

public class Ex4_PrintBio {



    public static void main(String[] args){

        Ex4_BioClass bc1 = new Ex4_BioClass();

        bc1.name = "Mustafa Gambani";
        bc1.age = 42;
        bc1.mothername = "Shukrani Gambani";
        bc1.location = "Männedorf";


        bc1.printBio();

    }



}
