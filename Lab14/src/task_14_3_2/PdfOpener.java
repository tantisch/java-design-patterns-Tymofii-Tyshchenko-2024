package task_14_3_2;

public class PdfOpener extends BaseFileOpener {
    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".pdf")) {
            System.out.println("Opening PDF file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}
