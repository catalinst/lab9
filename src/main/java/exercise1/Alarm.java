package exercise1;

public class Alarm extends Observable {

    public void startAlarm() {
        System.out.println("Alarm has been started!");
        this.changeState("START");
    }

    public void stopAlarm() {
        System.out.print("Alarm has been stopped!");
        this.changeState("STOP");
    }
}
