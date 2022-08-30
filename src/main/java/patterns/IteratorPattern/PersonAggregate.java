package patterns.IteratorPattern;

public interface PersonAggregate {
    boolean addPerson(Person person);
    boolean removePerson(Person person);
    PersonIterator externalIterator();

    PersonIterator internalIterator();
}
