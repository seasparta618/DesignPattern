package patterns.AdaptorPattern.ObjectAdaptor.adaptor;


import patterns.AdaptorPattern.ObjectAdaptor.card.SDCard;
import patterns.AdaptorPattern.ObjectAdaptor.card.TFCard;

public class SDOperateTFAdaptor implements SDCard {

    private TFCard tfCard;

    public SDOperateTFAdaptor(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void writeSD(String data) {
        System.out.println("Adaptor write TF card");
        this.tfCard.writeTF(data);
    }

    @Override
    public String readSD() {
        System.out.println("Adaptor read from TF card");
        return this.tfCard.readTF();
    }
}
