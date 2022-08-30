package patterns.StatePattern;

public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("Lift will open...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
        System.out.println("Lift will close");
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
    }
}
