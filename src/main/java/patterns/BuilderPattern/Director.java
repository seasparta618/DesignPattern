package patterns.BuilderPattern;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car constructor() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createCar();
    }

}
