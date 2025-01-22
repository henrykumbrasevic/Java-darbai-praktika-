package lt.techin.decorator;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new GreeterUpperCaseDecorator(new GreeterImpl());
        System.out.println(greeter.greet("General", "Patton"));
    }
}
