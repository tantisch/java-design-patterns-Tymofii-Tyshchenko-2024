package task_6_3_1;

public class Client {

    public static void main(String[] args) {
        TextEditor textEditor = TextEditor.getInstance();
        String text = textEditor.readFile("Lab6/src/task_6_3_1/targetFile.txt");
        System.out.println(text);

        TextEditor textEditor2 = TextEditor.getInstance();
        System.out.println("textEditor == textEditor2: " + (textEditor == textEditor2));

        textEditor2.countWords("Lab6/src/task_6_3_1/targetFile.txt");
        textEditor2.appendToFile("Lab6/src/task_6_3_1/targetFile.txt", "\nHello world!");
        textEditor2.writeToFile("Lab6/src/task_6_3_1/targetFile2.txt", "Hello world!");
    }
}
