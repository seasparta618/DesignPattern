package patterns.BridgePattern.VideoPlayer;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        OperatingSystem mac = new Mac(new AviFile());
        mac.play("GoodFriday");
        mac.setVideoFile(new RmvbFile());
        mac.play("DamnMonday");
    }
}
