public class Main {

    public static void main(String[] args){

        Person employee1 = new Employees("Marco", "Brolino", "Football", 23, 180,
                87, 77);

        Person teacher1 = new Teacher("Hans", "Meier", "Stricken", 54, 200,
                70, "Literatur", 3, 47);

        ((Employees) employee1).work();
        System.out.println(employee1.getFristName() + " is actually " + employee1.getAge() + " years old.");

        ((Teacher) teacher1).teachUni();

        Person dancer1 = new Dancer("Hernandes", "Hermann", "dancing", 17, 185,
                75, "Bachata", "advanced");

        ((Dancer) dancer1).dancerStatus();

    }
}
