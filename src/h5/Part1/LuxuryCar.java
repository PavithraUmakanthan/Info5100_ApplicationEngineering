package h5.Part1;

public class LuxuryCar extends CarDecorator {
    public ICar car;
    public LuxuryCar(ICar car) {
        super(car);
        this.car = car;

    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }

}
