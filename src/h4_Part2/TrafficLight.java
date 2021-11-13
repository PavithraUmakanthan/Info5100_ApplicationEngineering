package h4_Part2;

public class TrafficLight {
    private int present;

    public TrafficLight() {
        present = 0;
    }

    private static Object obj = new Object();

    public void waitingCar (int carNum, int roadNum, int direction, Runnable LightOnGreen, Runnable CarIsPassing){
        synchronized (obj) {
            if ((direction == 1 || direction == 2) && (present == 1)) {
                LightOnGreen.run();
                present = ((present + 1) % 2);
            } else if ((direction == 3 || direction == 4) && (present == 0)) {
                LightOnGreen.run();
                present = ((present + 1) % 2);
            }
            CarIsPassing.run();
        }
    }
}