package task_10_3_1;

public abstract class BaseDecorator implements Component {
    private final Component wrapper;

    public BaseDecorator(Component component) {
        this.wrapper = component;
    }

    @Override
    public void print() {
        wrapper.print();
    }
}
