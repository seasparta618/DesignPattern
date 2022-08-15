package patterns.AdaptorPattern.ObjectAdaptor.demo;

import org.junit.Test;
import patterns.AdaptorPattern.ObjectAdaptor.demo.adaptors.SquareToRoundAdaptor;
import patterns.AdaptorPattern.ObjectAdaptor.demo.round.RoundHole;
import patterns.AdaptorPattern.ObjectAdaptor.demo.round.RoundPeg;
import patterns.AdaptorPattern.ObjectAdaptor.demo.square.SquarePeg;

public class Client {

    @Test
    public void test(){
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(hole.fits(roundPeg)){
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePed = new SquarePeg(10);

        SquareToRoundAdaptor smallAdaptor = new SquareToRoundAdaptor(smallPeg);
        SquareToRoundAdaptor largeAdaptor = new SquareToRoundAdaptor(largePed);
        System.out.println("SquareToRoundPeg s"+smallPeg.getWidth()+" " + ((hole.fits(smallAdaptor)?"can":"cannot") + " fits round hole r5"));
        System.out.println("SquareToRoundPeg s"+largePed.getWidth()+" " + ((hole.fits(largeAdaptor)?"can":"cannot") + " fits round hole r5"));

    }
}
