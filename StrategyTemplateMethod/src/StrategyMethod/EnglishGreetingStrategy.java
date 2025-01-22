package StrategyMethod;

public class EnglishGreetingStrategy implements GreeterLanguageStrategy {
    @Override
    public String getGreetingString() {
        return "Good day, ";
    }
}