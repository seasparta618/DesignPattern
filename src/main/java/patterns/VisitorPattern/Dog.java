package patterns.VisitorPattern;

public class Dog implements Pet {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("Woof, Woof, Woof");
    }
}
