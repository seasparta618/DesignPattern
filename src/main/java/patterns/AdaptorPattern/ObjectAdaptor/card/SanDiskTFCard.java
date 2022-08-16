package patterns.AdaptorPattern.ObjectAdaptor.card;

public class SanDiskTFCard implements TFCard {
    @Override
    public void writeTF(String data) {
        System.out.println("Successfully write " + data + " into SanDiskTFCard");
    }

    @Override
    public String readTF() {
        return "This is the data from a brand of TF card";
    }
}
