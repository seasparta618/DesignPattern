package patterns.AdaptorPattern.ObjectAdaptor.demo.adaptors;

import patterns.AdaptorPattern.ObjectAdaptor.demo.round.RoundPeg;
import patterns.AdaptorPattern.ObjectAdaptor.demo.square.SquarePeg;

public class SquareToRoundAdaptor extends RoundPeg {
    private SquarePeg peg;

    public SquareToRoundAdaptor(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow(peg.getWidth() / 2, 2)) * 2);
    }
}
