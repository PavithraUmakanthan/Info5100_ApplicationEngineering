package h5.Part1;

public abstract class CarDecorator implements ICar {

    protected ICar baseCar = null;

    public CarDecorator(ICar car){
        baseCar = car;
    }
}
