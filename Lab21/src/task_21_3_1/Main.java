package task_21_3_1;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer(new BankAccountStrategy());
    customer.makePayment(100);

    customer.setStrategy(new PayPalStrategy());
    customer.makePayment(200);

    customer.setStrategy(new GooglePayStrategy());
    customer.makePayment(300);
  }

}
