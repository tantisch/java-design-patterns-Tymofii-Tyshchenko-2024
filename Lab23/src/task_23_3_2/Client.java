package task_23_3_2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        final List<MilitaryObject> militaryObjects = new ArrayList<>();
        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        SecretAgent secretAgent = new SecretAgent();
        Saboteur saboteur = new Saboteur();

        for (MilitaryObject military : militaryObjects) {
            military.accept(secretAgent);
        }

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        for (MilitaryObject military : militaryObjects) {
            military.accept(saboteur);
        }

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
    }

}
