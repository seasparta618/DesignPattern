package patterns.IteratorPattern;

import java.util.List;

public class PersonIteratorImpl implements PersonIterator {


    public PersonIteratorImpl(List<Person> list) {
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
