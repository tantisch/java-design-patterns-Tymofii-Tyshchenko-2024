package task_22_3_1;

/**
 * Пірат
 */
public class Pirate extends Defender {

  /**
   * Підняти зброю для захисту - оголити меч
   */
  @Override
  public void pickUpWeapon() {
    System.out.println("Pick up sword");
  }

  /**
   * Захист
   */
  @Override
  public void defenseAction() {
    System.out.println("Defend with sword");
  }

  /**
   * Повернення героя в безпечне місце
   */
  @Override
  public void moveToSafety() {
    System.out.println("Return to the ship");
  }

}
