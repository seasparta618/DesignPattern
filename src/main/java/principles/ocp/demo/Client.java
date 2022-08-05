package principles.ocp.demo;

import org.junit.Test;

public class Client {
    @Test
    public void test1() {
        Input input = new Input();
        AbstractSkin skin = new DefaultSkin();
        input.setSkin(skin);
        input.display();
        skin = new MyPreferenceSkin();
        input.setSkin(skin);
        input.display();

        // whenever a new skin type is defined, do not need to change the current skin type
        // core thinking of ocp
    }
}
