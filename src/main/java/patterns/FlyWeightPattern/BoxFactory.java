package patterns.FlyWeightPattern;

import javax.swing.*;
import java.util.HashMap;

public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private static volatile BoxFactory instance;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());
    }

    public AbstractBox getShape(String name) {
        return map.get(name);
    }

    public static BoxFactory getInstance() {
        if (instance == null) {
            synchronized ((BoxFactory.class)) {
                if (instance == null) {
                    instance = new BoxFactory();
                }
            }
        }
        return instance;
    }
}
