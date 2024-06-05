package task_20_3_3;

public class LowState extends State {
    public LowState(Fan context) {
        super(context);
    }

    @Override
    public void turnUp() {
        context.setState(new MediumState(context));
        System.out.println("Fan is on medium");
    }

    @Override
    public void turnDown() {}
}
