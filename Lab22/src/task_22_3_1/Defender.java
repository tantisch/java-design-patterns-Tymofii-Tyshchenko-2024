package task_22_3_1;

abstract class Defender {

    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

    public abstract void pickUpWeapon();

    public abstract void defenseAction();

    public abstract void moveToSafety();
}
