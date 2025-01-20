import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Person esko = new Student("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        Student ollie = new Student("Ollie", "Address");

        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki"));

        printPersons(persons);

    }
    public static void printPersons(ArrayList<Person>persons){
        System.out.println(persons);
    }

}
