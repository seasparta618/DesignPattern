package patterns.PrototypePattern.shallow.demo;

import org.junit.Test;

public class ConcreteTypeTest {
    @Test
    public void test() throws CloneNotSupportedException {
        ConcreteType concreteType = new ConcreteType();
        concreteType.setEmbeddedClass(new EmbeddedClass());
        ConcreteType clone = concreteType.clone();
        // the concreteType and the clone object are not the same object,
        // but the new object's content and attributes are same with the old one
        // this is a shallow clone/copy
        assert clone != concreteType;
        // for the reference type, they will point to the same address, below will return true
        assert clone.getEmbeddedClass() == concreteType.getEmbeddedClass();
    }
}
