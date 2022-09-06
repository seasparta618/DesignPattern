package patterns.VisitorPattern;

public class Cat implements Pet {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("Mew Mew Mew");
    }
}
