package exercise1;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Alarm fireAlarm = new Alarm();
        AlarmMonitor monitor = new AlarmMonitor();
        fireAlarm.register(monitor);

        AlarmController alarmController = new AlarmController();
        fireAlarm.register(alarmController);

        fireAlarm.startAlarm();
        Thread.sleep(500);
        fireAlarm.stopAlarm();
    }
}
