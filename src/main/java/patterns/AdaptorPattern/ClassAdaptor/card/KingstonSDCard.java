package patterns.AdaptorPattern.ClassAdaptor.card;

public class KingstonSDCard implements SDCard{
    @Override
    public void writeSD(String data) {
        System.out.println("Successfully write "+ data +" into kingston SD Card");
    }

    @Override
    public String readSD() {
        return "This is the data from a Kingston SD Card";
    }
}
