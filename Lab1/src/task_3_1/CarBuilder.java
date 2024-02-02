package task_3_1;

public class CarBuilder {

    public Car buildCar(int enginePower, String engineType, int wheelDiameter, String wheelType) {
        Engine engine = new Engine(enginePower, engineType);
        Wheel wheel = new Wheel(wheelDiameter, wheelType);
        Car car = new Car(engine, wheel);

        int buildTime = engine.getBuildTime() + wheel.getBuildTime();
        System.out.println("Car build time: " + buildTime);

        return car;
    }

    public void changeCarEngine(Car car, int enginePower, String engineType) {
        Engine engine = new Engine(enginePower, engineType);
        car.setEngine(engine);
    }

    public void changeCarWheel(Car car, int wheelDiameter, String wheelType) {
        Wheel wheel = new Wheel(wheelDiameter, wheelType);
        car.setWheel(wheel);
    }

    public void rebuildCar(Car car, int enginePower, String engineType, int wheelDiameter, String wheelType) {
        changeCarEngine(car, enginePower, engineType);
        changeCarWheel(car, wheelDiameter, wheelType);
    }
}
