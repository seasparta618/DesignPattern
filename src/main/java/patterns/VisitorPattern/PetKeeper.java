package patterns.VisitorPattern;

public class PetKeeper implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("Pet Keeper feeds cat");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("Pet Keeper feeds dog");
    }
}
