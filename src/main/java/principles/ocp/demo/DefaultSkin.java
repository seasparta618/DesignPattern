package principles.ocp.demo;

/**
 * default skin class
 */
public class DefaultSkin extends AbstractSkin {
    @Override
    public void display() {
        System.out.println("This is the default class");
    }
}
