package StrategyMethod;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter(new LithuanianGreetingStrategy(), new SingleExclamationMark());
        greeter.greet("Henryk", "Umbrasevic");

    }
}
