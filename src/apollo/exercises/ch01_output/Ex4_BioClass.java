package apollo.exercises.ch01_output;

public class Ex4_BioClass {

    public String name;
    public int age;
    public String location;
    public String mothername;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getMothername() {
        return mothername;
    }

    public void printBio(){
        System.out.println("His name is " + this.name + " and he is " + this.age + " years old." + "\n" +
                "He does live with his mom " + this.mothername + " in " + this.location + ".");
    }
}
