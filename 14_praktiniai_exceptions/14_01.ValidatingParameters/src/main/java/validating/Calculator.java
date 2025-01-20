package validating;

public class Calculator {

    public int factorial(int num) throws IllegalArgumentException {

        int answer = 1;
        if (num < 0){
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;

    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        if (subsetSize < 0 || subsetSize > setSize){
            throw new IllegalArgumentException();
        }
        return numerator / denominator;
    }
}
