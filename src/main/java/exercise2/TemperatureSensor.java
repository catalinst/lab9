package exercise2;

import java.util.Random;

public class TemperatureSensor implements Observer {

    @Override
    public void readSensor() {
        Random random = new Random();
        System.out.println("Sensor detects " + random.nextInt(30) + "°C");
    }
}
