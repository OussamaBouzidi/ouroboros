public class Dancer extends Person{

    private String danceStyle;
    private String niveau;


    public Dancer(String firstName, String lastName, String hobby, int age, int height, int weight,
                  String danceStyle, String niveau) {
        super(firstName, lastName, hobby, age, height, weight);
        this.danceStyle = danceStyle;
        this.niveau = niveau;
    }

    public String getDanceStyle() {
        return danceStyle;
    }

    public void setDanceStyle(String danceStyle) {
        this.danceStyle = danceStyle;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void dancerStatus(){
        System.out.println("Mr. " + super.getLastName() + " has a " + this.danceStyle + " style");
    }
}
