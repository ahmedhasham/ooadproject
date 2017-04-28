package javaapplication13;


public class ChickenBurger implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Burger";
    }

    @Override
    public int foodPrice() {
        return 220;
    }
}
