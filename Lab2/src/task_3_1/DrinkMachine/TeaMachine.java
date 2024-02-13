package task_3_1.DrinkMachine;

import task_3_1.Drinks.*;

public class TeaMachine extends DrinkMachine {
    @Override
    public HotDrink makeDrink(DrinkType drinkType, int sugar) {
        HotDrink drink;

        if (drinkType instanceof TeaType) {
            switch ((TeaType) drinkType) {
                case BLACKTEA -> {
                    drink = new BlackTea(sugar);
                    System.out.println("Making 'black tea' with " + sugar + " sugar. Drink price: " + drink.getPrice());
                    return drink;
                }
                case GREENTEA -> {
                    drink = new GreenTea(sugar);
                    System.out.println("Making 'green tea' with " + sugar + " sugar. Drink price: " + drink.getPrice());
                    return drink;
                }
                default -> throw new IllegalArgumentException("Wrong drink type");
            }
        } else {
            throw new IllegalArgumentException("Wrong drink type");
        }
    }
}
