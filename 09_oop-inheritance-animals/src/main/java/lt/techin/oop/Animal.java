package lt.techin.oop;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    private Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    private String getDescription (){
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + hasFur;
    }
}
