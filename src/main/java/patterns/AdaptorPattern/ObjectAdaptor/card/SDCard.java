package patterns.AdaptorPattern.ObjectAdaptor.card;

public interface SDCard {
    void writeSD(String data);

    String readSD();
}
