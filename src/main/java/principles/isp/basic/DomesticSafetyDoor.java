package principles.isp.basic;

/**
 * this design could tell the ISafeDoor design violates the isp
 * as ISafetyDoor is not abstracted on the smallest functionality
 * it could make sense that the implementation of CommercialSafetyDoor could do antiTheft, fireproof and waterproof
 * but the DomesticSafetyDoor do not need to be fireproof and waterproof
 */
public class DomesticSafetyDoor implements ISafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("This door is anti theft");
    }

    @Override
    public void fireProof() {

    }

    @Override
    public void waterProof() {

    }
}
