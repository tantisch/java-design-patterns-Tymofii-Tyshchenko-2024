package task_21_3_2;

public class  Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new SubStrategy());
        calculator.execute(12, 13);

        calculator.setStrategy(new AddStrategy());
        calculator.execute(12, 13);

        calculator.setStrategy(new MulStrategy());
        calculator.execute(12, 13);
    }

}
