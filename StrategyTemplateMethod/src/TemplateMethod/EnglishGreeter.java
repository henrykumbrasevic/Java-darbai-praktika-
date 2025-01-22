package TemplateMethod;

public class EnglishGreeter extends Greeter {

    @Override
    protected String getGreetingString() {
        return "Good day";
    }

}
