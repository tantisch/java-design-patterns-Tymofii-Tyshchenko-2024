package task_14_3_2;

public class PresentationOpener extends BaseFileOpener {
    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".pptx")) {
            System.out.println("Opening presentation file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}
