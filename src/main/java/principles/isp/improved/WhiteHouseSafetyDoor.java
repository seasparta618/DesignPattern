package principles.isp.improved;

public class WhiteHouseSafetyDoor extends SafetyDoor implements IWaterProof, IFireProof, IAntiRocket {
    @Override
    public void antiRocket() {
        System.out.println("This door could anti rocket");
    }

    @Override
    public void fireproof() {
        System.out.println("This door is fireproof");
    }

    @Override
    public void waterproof() {
        System.out.println("This door is waterproof");
    }

    @Override
    void antiTheft() {
        System.out.println("This door could anti theft");
    }
}
