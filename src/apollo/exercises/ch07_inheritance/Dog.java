package apollo.exercises.ch07_inheritance;

import apollo.exercises.ch09_advanced.Alarm;

public class Dog extends Animal implements Alarm {

    boolean isGuideDog = false;
    private boolean alarmEnabled;

    public Dog(String sex, int weight, boolean isGuideDog) {
        super(sex, weight);
        this.isGuideDog = isGuideDog;
    }

    public Dog(String sex, int weight){
        super(sex, weight);
    }

    public boolean isGuideDog() {
        return isGuideDog;
    }

    public void setGuideDog(boolean guideDog) {
        isGuideDog = guideDog;
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }


}
