package principles.dip.demo;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        IHardDisk hardDisk = new Seagate();
        ICPU cpu = new IntelCPU();
        IMemory memory = new KingstonMemory();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        computer.start();
    }
}
