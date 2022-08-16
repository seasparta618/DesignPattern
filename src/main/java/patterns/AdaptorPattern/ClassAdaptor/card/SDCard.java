package patterns.AdaptorPattern.ClassAdaptor.card;

public interface SDCard {
    void writeSD(String data);

    String readSD();
}
