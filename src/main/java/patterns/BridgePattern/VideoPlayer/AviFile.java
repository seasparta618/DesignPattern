package patterns.BridgePattern.VideoPlayer;


public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("This is an avi file: " + fileName);
    }
}
