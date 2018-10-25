public class Employees extends Person{

    private int id;


    public Employees(String firstName, String lastName, String hobby, int age, int height, int weight, int id) {
        super(firstName, lastName, hobby, age, height, weight);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work(){
        System.out.println(this.getFristName() + " " + this.getLastName() + " is working well!");
    }

    @Override
    public int getAge(){
        return super.getAge();
    }

}
