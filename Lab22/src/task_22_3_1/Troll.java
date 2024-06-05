package task_22_3_1;

/**
 * Троль
 */
public class Troll extends Defender {

  /**
   * Підняти булаву
   */
  @Override
  public void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  /**
   * Захищатися за допомогою булави
   */
  @Override
  public void defenseAction() {
    System.out.println("Defend with club");
  }

  /**
   * Повернутися в безпечне місце в горах
   */
  @Override
  public void moveToSafety() {
    System.out.println("Return to the mountain");
  }


}
