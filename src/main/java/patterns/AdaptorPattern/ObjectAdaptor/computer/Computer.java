package patterns.AdaptorPattern.ObjectAdaptor.computer;

import patterns.AdaptorPattern.ObjectAdaptor.card.SDCard;

public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SD card cannot be null");
        }
        return sdCard.readSD();
    }
}
