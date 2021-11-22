package h5.Part1;

public class Main {

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println();

        SportsCar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}


