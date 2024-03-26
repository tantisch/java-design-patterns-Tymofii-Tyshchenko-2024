package task_4_3_2;

public class Client {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        MyString myString = myStringBuilder
                .append("Hello")
                .append(" ")
                .append("World")
                .append("!")
                .incert("Java", 6)
                .incert(" ", 10)
                .replace("builder!", 11, 5)
                .deleteSubString(18, 1)
                .build();
        System.out.println(myString);
    }
}
