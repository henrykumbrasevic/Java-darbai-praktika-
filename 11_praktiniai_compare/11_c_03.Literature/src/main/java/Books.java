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
    public int getCount(){
        return count;
    }

    public String toString() {
        return count + name + " (recommended for " + age + " year-olds or older)";
    }

    @Override
    public int compareTo(Books o) {
        if (this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);
        }
        return Integer.compare(o.age, this.age);
    }

}
