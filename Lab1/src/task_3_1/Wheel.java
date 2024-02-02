package task_3_1;

public class Wheel {
    private final int diameter;
    private final String type;
    private final int buildTime;

    Wheel(int diameter, String type) {
        this.diameter = diameter;
        this.type = type;
        this.buildTime = randomBuildTime();
    }

    private int randomBuildTime() {
        return (int) (Math.random() * 15 + 1);
    }

    public int getBuildTime() {
        return buildTime;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", type='" + type + '\'' +
                '}';
    }
}
