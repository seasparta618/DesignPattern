package patterns.VisitorPattern;

public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);
}
