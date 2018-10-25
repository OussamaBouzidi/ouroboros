public class Teacher extends Person{

    private String subject;
    private int classes;
    private int students;

    public Teacher(String firstName, String lastName, String hobby, int age, int height, int weight, String subject,
                   int classes, int students) {
        super(firstName, lastName, hobby, age, height, weight);
        this.subject = subject;
        this.classes = classes;
        this.students = students;
    }

    public void teachUni(){
        System.out.println("This teacher has " + this.classes + " classes and approximately " + this.students +
                " students for the subject " + this.subject);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
}
