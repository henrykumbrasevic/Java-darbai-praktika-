package StrategyMethod;

public class LithuanianGreetingStrategy implements GreeterLanguageStrategy {

    @Override
    public String getGreetingString() {
        return "Laba diena, ";
    }
}
