package patterns.AdaptorPattern.demo.adaptors;

import patterns.AdaptorPattern.demo.round.RoundPeg;
import patterns.AdaptorPattern.demo.square.SquarePeg;

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
