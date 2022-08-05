package principles.isp.basic;

public class CommercialSafetyDoor implements ISafetyDoor {

    @Override
    public void antiTheft() {
        System.out.println("This door can anti theft");
    }

    @Override
    public void fireProof() {

        System.out.println("This door is fire proof");
    }

    @Override
    public void waterProof() {
        System.out.println("This door is water proof");
    }
}
