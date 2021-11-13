package h4_Part2;

public class ThreadTrafficLight implements Runnable{
     Thread CarIsPassing = new Thread(new CarIsPassing());
     Thread LightOnGreen = new Thread(new LightOnGreen());
    TrafficLight trafficLight;
    @Override
    public void run() {
        trafficLight.waitingCar(1,2,3,LightOnGreen,CarIsPassing);
    }
    public ThreadTrafficLight(){
        trafficLight = new TrafficLight();
    }

}
