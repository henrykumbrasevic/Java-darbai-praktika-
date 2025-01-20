package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors = new ArrayList<>();
    private List<Integer> result = new ArrayList<>();


    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        int average = 0;
        if (!isOn()) {
            throw new IllegalArgumentException();
        }
        for (Sensor sensor : sensors) {
            average += sensor.read();
        }
        average = average / sensors.size();
        result.add(average);
        return average;

    }

    public List<Integer> readings() {
        return result;
    }
}
