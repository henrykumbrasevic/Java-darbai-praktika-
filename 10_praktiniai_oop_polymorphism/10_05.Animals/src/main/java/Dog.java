public class Dog extends Animal implements NoiseCapable {

    private String name;

    public Dog(){
        this.name = "Dog";
    }

    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println(name + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
