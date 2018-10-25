public class Person {

    private String firstName;
    private String lastName;
    private String hobby;
    private int age;
    private int height;
    private int weight;

    public Person(String firstName, String lastName, String hobby, int age, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hobby = hobby;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFristName() {
        return firstName;
    }

    public void setFristName(String fristName) {
        this.firstName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
