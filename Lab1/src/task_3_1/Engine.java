package task_3_1;

public class Engine {
    private final int power;
    private final String type;
    private final int buildTime;

    Engine(int power, String type) {
        this.power = power;
        this.type = type;
        this.buildTime = 15;
    }

    public int getPower() {
        return power;
    }

    public int getBuildTime() {
        return buildTime;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                '}';
    }
}
