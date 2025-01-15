public class Cat extends Animal implements NoiseCapable {

    public String name;

    public Cat(String name){
        super(name);
    }
    public Cat(){
        this.name = "Cat";
    }
    public void purr(){
        System.out.println(name + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
