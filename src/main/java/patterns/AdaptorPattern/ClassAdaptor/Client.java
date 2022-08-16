package patterns.AdaptorPattern.ClassAdaptor;

import org.junit.Test;
import patterns.AdaptorPattern.ClassAdaptor.adaptor.SDAdaptor;
import patterns.AdaptorPattern.ClassAdaptor.card.KingstonSDCard;
import patterns.AdaptorPattern.ClassAdaptor.computer.Computer;

public class Client {

    @Test
    public void testDirectReadSDCard() {
        Computer computer = new Computer();
        String sdCardMessage = computer.readSD(new KingstonSDCard());
        System.out.println(sdCardMessage);

    }

    @Test
    public void testThruAdaptor() {
        Computer computer = new Computer();
        String s = computer.readSD(new SDAdaptor());
        System.out.println(s);
    }
}
