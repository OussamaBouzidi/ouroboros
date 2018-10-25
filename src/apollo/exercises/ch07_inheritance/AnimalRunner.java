package apollo.exercises.ch07_inheritance;

import apollo.exercises.ch09_advanced.Alarm;

public class AnimalRunner {

    public static void main(String [] args){
        Animal animal1 = new Animal("Male", 23);

        Dog dog1 = new Dog("Male", 32, true);
        Cat cat1 = new Cat("Female", 15, false);

        dog1.speak();
        cat1.speak();

        speak(dog1);
        speak(cat1);

        //dog1.alertedDog(true);


    }



    public static void speak(Animal animal){
        animal.speak();
    }
}
