package apollo.exercises.ch07_inheritance;

public class Cat extends Animal{

    boolean lovesCatnip = true;

    public Cat(String sex, int weight, boolean lovesCatnip) {
        super(sex, weight);
        this.lovesCatnip = lovesCatnip;
    }

    public Cat(String sex, int weight) {
        super(sex, weight);
    }

    public boolean isLovesCatnip() {
        return lovesCatnip;
    }

    public void setLovesCatnip(boolean lovesCatnip) {
        this.lovesCatnip = lovesCatnip;
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
