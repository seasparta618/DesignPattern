package principles.dip.demo;

public class KingstonMemory implements IMemory {


    @Override
    public void save() {
        System.out.println("Saved to kingston memory");
    }

    @Override
    public void remove() {
        System.out.println("Read from kingston memory");
    }
}
