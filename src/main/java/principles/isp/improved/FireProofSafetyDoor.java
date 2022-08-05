package principles.isp.improved;

public class FireProofSafetyDoor extends SafetyDoor implements IFireProof {
    @Override
    void antiTheft() {
        System.out.println("This door could anti theft");
    }

    @Override
    public void fireproof() {
        System.out.println("This door is fire proof");
    }
}
