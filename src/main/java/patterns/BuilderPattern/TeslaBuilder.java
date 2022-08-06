package patterns.BuilderPattern;

public class TeslaBuilder extends Builder {
    @Override
    public void buildFrame() {
        car.setFrame("Tesla frame");
    }

    @Override
    public void buildSeat() {
        car.setSeat("Tesla electronic seat, Black color");
    }

    @Override
    public Car createCar() {
        return car;
    }
}
