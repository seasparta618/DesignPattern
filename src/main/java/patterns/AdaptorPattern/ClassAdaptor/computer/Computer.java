package patterns.AdaptorPattern.ClassAdaptor.computer;

import patterns.AdaptorPattern.ClassAdaptor.card.SDCard;

public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SD card cannot be null");
        }
        return sdCard.readSD();
    }
}
