package exercise2;

import java.util.Random;

public class HumiditySensor implements Observer {

    @Override
    public void readSensor() {
        Random random = new Random();
        System.out.println("Sensor detects " + random.nextInt(5) + "% humidity");
    }
}
