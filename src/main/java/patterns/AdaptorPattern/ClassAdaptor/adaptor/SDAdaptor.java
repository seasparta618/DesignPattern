package patterns.AdaptorPattern.ClassAdaptor.adaptor;

import patterns.AdaptorPattern.ClassAdaptor.card.SDCard;
import patterns.AdaptorPattern.ClassAdaptor.card.SanDiskTFCard;

public class SDAdaptor extends SanDiskTFCard implements SDCard {
    @Override
    public void writeSD(String data) {
        System.out.println("Adaptor write TF card");
        writeTF(data);
    }

    @Override
    public String readSD() {
        System.out.println("Adaptor read from TF card");
        return readTF();
    }
}
