package javaapplication13;

public class ChickenBiryani implements FoodItem{
    @Override
    public String foodName() {
        return "Chicken Biryani";
    }

    @Override
    public int foodPrice() {
        return 120;
    }
}
