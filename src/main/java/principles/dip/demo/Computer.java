package principles.dip.demo;

public class Computer {
    private ICPU cpu;
    private IHardDisk hardDisk;

    private IMemory memory;

    public void start() {
        System.out.println("Computer started");
        this.cpu.run();
        this.memory.save();
        this.hardDisk.get();
    }

    public ICPU getCpu() {
        return cpu;
    }

    public void setCpu(ICPU cpu) {
        this.cpu = cpu;
    }

    public IHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(IHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IMemory getMemory() {
        return memory;
    }

    public void setMemory(IMemory memory) {
        this.memory = memory;
    }


}
