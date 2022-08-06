package patterns.BuilderPattern;

import org.junit.Test;

public class ComputerTest {
    @Test
    public void test() {
        Computer computer = new Computer.
                Builder().
                cpu("Intel").
                screen("Samsung").
                mainBoard("Amd").
                memory("kingston").build();
        System.out.println(computer);
    }
}
