package task_14_3_2;

public interface FileHandler {
    void setNext(FileHandler nextHandler);
    void openFile(String fileName);
}
