package StrategyMethod;

public class Greeter {

    private GreeterLanguageStrategy greeterLanguageStrategy;
    private Ending ending;

    public Greeter(GreeterLanguageStrategy greeterLanguageStrategy, Ending ending) {
        this.greeterLanguageStrategy = greeterLanguageStrategy;
        this.ending = ending;
    }

    public void greet(String firstName, String lastName) {
        System.out.println(greeterLanguageStrategy.getGreetingString() + firstName + " " + lastName + ending.getGreetingString());
    }
}
