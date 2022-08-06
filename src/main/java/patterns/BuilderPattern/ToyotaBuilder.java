package patterns.BuilderPattern;

public class ToyotaBuilder extends Builder {
    @Override
    public void buildFrame() {
        System.out.println("Toyota frame");
    }

    @Override
    public void buildSeat() {
        System.out.println("Toyota leather seat, brown color");
    }

    @Override
    public Car createCar() {
        return car;
    }
}
