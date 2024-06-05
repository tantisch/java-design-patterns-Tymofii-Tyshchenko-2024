package task_21_3_1;

public class Customer {

  private Strategy strategy;

  public Customer(Strategy strategy) {
      this.strategy = strategy;
  }

  public void setStrategy(Strategy strategy) {
      this.strategy = strategy;
  }

  public void makePayment(int amount) {
      strategy.makePayment(amount);
  }

}
