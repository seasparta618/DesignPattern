package principles.dip.demo;

public class Seagate implements IHardDisk {
    @Override
    public void save() {
        System.out.println("saved to Seagate hard disk");
    }

    @Override
    public void get() {
        System.out.println("read from Seagate hard disk");
    }
}
