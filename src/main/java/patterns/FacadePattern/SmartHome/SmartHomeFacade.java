package patterns.FacadePattern.SmartHome;

public class SmartHomeFacade {
    private Light light;
    private AirConditioner airConditioner;
    private TV tv;

    public SmartHomeFacade() {
        light = new Light();
        tv = new TV();
        airConditioner = new AirConditioner();
    }

    public void say(String message) {
        if (message.contains("turn on")) {
            this.on();
        } else if (message.contains("turn off")) {
            this.off();
        } else {
            System.out.println("cannot understand");
        }
    }

    private void on() {
        light.on();
        tv.on();
        airConditioner.on();
    }

    private void off() {
        light.off();
        tv.off();
        airConditioner.off();
    }
}
