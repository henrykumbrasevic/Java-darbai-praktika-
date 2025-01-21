import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    List<Person> employees = new ArrayList<>();

    public Employees() {

    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        employees.addAll(peopleToAdd);
    }

    public void print() {
        System.out.println(employees);
    }

    public void print(Education education) {
        //employees.stream().filter(e->e.getEducation().equals(education)).forEach(System.out::println);

        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.print(person);
            }
        }
    }

    public void fire(Education education) {
        employees.removeIf(employee -> employee.getEducation().equals(education));
    }
}
