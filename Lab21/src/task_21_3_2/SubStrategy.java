package task_21_3_2;

public class SubStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        int res = a - b;
        System.out.printf("%s - %s = %s%n", a, b, res);
        return res;
    }
}
