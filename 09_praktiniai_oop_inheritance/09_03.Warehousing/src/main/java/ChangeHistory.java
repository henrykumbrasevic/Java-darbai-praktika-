import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history = new ArrayList<>();

    public ChangeHistory() {

    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            return history.stream().max(Double::compare).orElse(Double.NaN);
        }
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            return history.stream().min(Double::compare).orElse(Double.NaN);
        }
    }

    public double average() {
        int average = 0;
        if (history.isEmpty()) {
            return 0;
        } else {
            for (Double history : history) {
                average += history;
            }
        }
        return (double) average / history.size();
    }
}
