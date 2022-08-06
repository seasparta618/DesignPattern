package patterns.BuilderPattern;

import org.junit.Test;

public class BuilderPatternTest {
    @Test
    public void test() {
        Director director = new Director(new TeslaBuilder());

        Car car = director.constructor();

        System.out.println(car.getFrame());
        System.out.println(car.getSeat());
    }
}
