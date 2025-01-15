public class Books {

    private String name;
    private int age;

    public Books(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void countBooks(){
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return name + " (recommended for " + age + " year-olds or older)";
    }
}

