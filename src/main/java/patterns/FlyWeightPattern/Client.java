package patterns.FlyWeightPattern;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        AbstractBox boxI = BoxFactory.getInstance().getShape("I");
        boxI.display("grey");
        AbstractBox boxL = BoxFactory.getInstance().getShape("L");
        boxL.display("green");
        AbstractBox boxO = BoxFactory.getInstance().getShape("O");
        boxO.display("red");
        AbstractBox boxL2 = BoxFactory.getInstance().getShape("L");
        boxL2.display("green");
        assert (boxL == boxL2);
    }
}
