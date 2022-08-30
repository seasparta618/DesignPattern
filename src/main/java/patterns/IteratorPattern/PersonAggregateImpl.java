package patterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PersonAggregateImpl implements PersonAggregate {
    private List<Person> list = new ArrayList<>();

    @Override
    public boolean addPerson(Person person) {
        return this.list.add(person);
    }

    @Override
    public boolean removePerson(Person person) {
        return this.list.remove(person);
    }

    @Override
    public PersonIterator externalIterator() {
        return new InternalIterator(this.list);
    }

    @Override
    public PersonIterator internalIterator() {
        return new InternalIterator(this.list);
    }

    private class InternalIterator implements PersonIterator {

        public InternalIterator(List<Person> list) {
            this.list = list;
        }

        private List<Person> list;

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Person next() {
            Person p = list.get(index);
            index++;
            return p;
        }
    }
}
