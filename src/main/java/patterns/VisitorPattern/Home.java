package patterns.VisitorPattern;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Pet> pets = new ArrayList<>();

    public void add(Pet pet) {
        this.pets.add(pet);
    }

    public void action(Person person) {
        for (Pet pet : pets) {
            pet.accept(person);
        }
    }
}
