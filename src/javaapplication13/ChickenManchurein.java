package javaapplication13;


public class ChickenManchurein implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Manchurian";
    }

    @Override
    public int foodPrice() {
        return 550;
    }
}
