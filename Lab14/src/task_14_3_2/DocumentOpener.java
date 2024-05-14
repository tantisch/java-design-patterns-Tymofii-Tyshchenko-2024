package task_14_3_2;

public class DocumentOpener extends BaseFileOpener {
    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".doc") || fileName.endsWith(".docx")) {
            System.out.println("Opening document file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}
