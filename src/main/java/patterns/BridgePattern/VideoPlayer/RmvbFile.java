package patterns.BridgePattern.VideoPlayer;

public class RmvbFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("This is an rmvb file: " + fileName);

    }
}
