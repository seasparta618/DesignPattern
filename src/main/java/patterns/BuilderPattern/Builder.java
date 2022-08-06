package patterns.BuilderPattern;

public abstract class Builder {

    protected Car car = new Car();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Car createCar();

}
