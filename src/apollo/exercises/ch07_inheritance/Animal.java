package apollo.exercises.ch07_inheritance;

public class Animal {

    String sex;
    int weight;

    public Animal(String sex, int weight) {
        this.sex = sex;
        this.weight = weight;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void speak(){

    }
}
