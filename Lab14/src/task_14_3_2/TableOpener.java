package task_14_3_2;

public class TableOpener extends BaseFileOpener {
    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) {
            System.out.println("Opening table file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}
