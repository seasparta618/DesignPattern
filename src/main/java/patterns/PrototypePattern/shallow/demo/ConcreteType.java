package patterns.PropertyPattern.shallow.demo;

public class ConcreteType implements Cloneable {
    public ConcreteType() {
        System.out.println("Concrete property object created!");
    }

    public void setEmbeddedClass(EmbeddedClass embeddedClass) {
        this.embeddedClass = embeddedClass;
    }

    public EmbeddedClass getEmbeddedClass() {
        return embeddedClass;
    }

    private EmbeddedClass embeddedClass;



    @Override
    public ConcreteType clone() throws CloneNotSupportedException {
        return (ConcreteType) super.clone();
    }
}
