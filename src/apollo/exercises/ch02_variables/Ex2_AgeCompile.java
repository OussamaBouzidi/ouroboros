package apollo.exercises.ch02_variables;

public class Ex2_AgeCompile {

    public int age;
    public int thoughtAge;

    public Ex2_AgeCompile(int age) {
        this.age = age;
    }

    public void complimentaryAge(){

        int thoughtAge = age - 5;
        System.out.println(this.age + "?, Really? I thought you were " + thoughtAge + "!");
    }

}
