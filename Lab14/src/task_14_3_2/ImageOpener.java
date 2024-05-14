package task_14_3_2;

public class ImageOpener extends BaseFileOpener {
    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".jpg") || fileName.endsWith(".png")) {
            System.out.println("Opening image file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}
