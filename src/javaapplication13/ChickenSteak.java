package javaapplication13;


public class ChickenSteak implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Steak";
    }

    @Override
    public int foodPrice() {
        return 600;
    }
}
