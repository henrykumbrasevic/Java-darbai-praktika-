package TemplateMethod;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new EnglishGreeter();
        greeter.greet("Henryk", "Umbrasevic");
    }
}
