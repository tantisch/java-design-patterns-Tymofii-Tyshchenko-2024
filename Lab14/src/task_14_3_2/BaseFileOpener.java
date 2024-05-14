package task_14_3_2;

public abstract class BaseFileOpener implements FileHandler {
    protected FileHandler nextHandler;

    @Override
    public void setNext(FileHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
