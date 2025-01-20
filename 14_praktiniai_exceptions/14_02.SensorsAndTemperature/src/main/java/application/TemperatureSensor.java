package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean on;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        int randomNumber;
        if (isOn()) {
            randomNumber = new Random().nextInt(61) - 30;
        } else {
            throw new IllegalArgumentException();
        }
        return randomNumber;
    }
}