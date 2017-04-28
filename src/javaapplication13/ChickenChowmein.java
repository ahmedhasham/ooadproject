package javaapplication13;


public class ChickenChowmein implements FoodItem{
    @Override
    public String foodName() {
        return "Chicken Chowmein";
    }

    @Override
    public int foodPrice() {
        return 500;
    }
}
