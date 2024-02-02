package task_3_1;

public class task_3_1_main {
    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator(100, "gas", 20, "summer");
        System.out.println("Car: " + carSimulator.getCar());
        carSimulator.simulateCarRunTime(1000);
        carSimulator.rebuildCar(200, "diesel", 30, "winter");
        carSimulator.simulateCarRunTime(1000);
    }
}
