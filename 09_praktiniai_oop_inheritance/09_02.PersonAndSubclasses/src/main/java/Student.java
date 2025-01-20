public class Student extends Person {

    private int credits;

    public Student(){

    }

    public Student(String name, String address){
        super(name, address);
    }

    public int credits(){
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void study (){
        credits += 1;
    }

    @Override
    public String toString(){
        return super.toString() + "  \n" + "  Study credits " + credits;
    }
}
