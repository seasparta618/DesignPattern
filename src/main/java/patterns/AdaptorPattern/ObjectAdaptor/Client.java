package patterns.AdaptorPattern.ObjectAdaptor;

import org.junit.Test;
import patterns.AdaptorPattern.ObjectAdaptor.adaptor.SDOperateTFAdaptor;
import patterns.AdaptorPattern.ObjectAdaptor.card.KingstonSDCard;
import patterns.AdaptorPattern.ObjectAdaptor.card.SanDiskTFCard;
import patterns.AdaptorPattern.ObjectAdaptor.computer.Computer;

public class Client {

    @Test
    public void testDirectReadSDCard() {
        Computer computer = new Computer();
        String sdCardMessage = computer.readSD(new KingstonSDCard());
        System.out.println(sdCardMessage);

    }

    @Test
    public void testThruObjectAdaptor() {
        Computer computer = new Computer();
        String sdCardMessage = computer.readSD(new SDOperateTFAdaptor(new SanDiskTFCard()));
        System.out.println(sdCardMessage);
    }
}
