package task_3_1;

public class CarSimulator {

    private final CarBuilder carBuilder;
    private final Car car;

    CarSimulator(int enginePower, String engineType, int wheelDiameter, String wheelType) {
        this.carBuilder = new CarBuilder();
        this.car = carBuilder.buildCar(enginePower, engineType, wheelDiameter, wheelType);
    }

    public void rebuildCar(int enginePower, String engineType, int wheelDiameter, String wheelType) {
        carBuilder.rebuildCar(car, enginePower, engineType, wheelDiameter, wheelType);
        System.out.println("New car: " + car);
    }

    public void simulateCarRunTime(int distance ) {
        int time = distance / car.getEngine().getPower();
        System.out.println("Car run time: " + time);
    }

    public Car getCar() {
        return car;
    }
}
