public class Books implements Comparable<Books> {

    private String name;
    private int age;
    private int count;

    public Books(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void countBooks() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (recommended for " + age + " year-olds or older)";
    }

    @Override
    public int compareTo(Books o) {
        int ageCompare = Integer.compare(this.age, o.age);
        if (ageCompare == 0) {
            return this.name.compareTo(o.name);
        } else {
            return ageCompare;
        }
    }
}
