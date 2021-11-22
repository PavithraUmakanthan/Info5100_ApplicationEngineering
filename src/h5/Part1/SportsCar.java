package h5.Part1;

public class SportsCar extends CarDecorator {
    public ICar car;
    public SportsCar(ICar car) {
        super(car);
        this.car= car;

    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding features of Sports Car.");
    }
}
