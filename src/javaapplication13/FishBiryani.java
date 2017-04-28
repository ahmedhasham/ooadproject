package javaapplication13;


public class FishBiryani implements FoodItem {
    @Override
    public String foodName() {
        return "Fish Biryani";
    }

    @Override
    public int foodPrice() {
        return 150;
    }
}
