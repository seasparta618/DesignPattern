package principles.dip.demo;

public class IntelCPU implements ICPU{

    @Override
    public void run() {
        System.out.println("Intel cpu started");
    }
}
