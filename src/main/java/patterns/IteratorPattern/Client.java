package patterns.IteratorPattern;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        PersonAggregate aggregate = new PersonAggregateImpl();
        aggregate.addPerson(new Person("Leon", 25));
        aggregate.addPerson(new Person("Lion", 30));
        aggregate.addPerson(new Person("Lenion", 27));

        PersonIterator iterator = aggregate.externalIterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next.toString());
        }

        iterator = aggregate.internalIterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next.toString());
        }
    }
}
