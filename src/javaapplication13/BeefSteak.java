package javaapplication13;


public class BeefSteak implements FoodItem {
    @Override
    public String foodName() {
        return "Beef Steak";
    }

    @Override
    public int foodPrice() {
        return 700;
    }
}
