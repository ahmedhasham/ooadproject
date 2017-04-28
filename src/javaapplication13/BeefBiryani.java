package javaapplication13;


public class BeefBiryani implements FoodItem {
    @Override
    public String foodName() {
        return "Beef Biryani";
    }

    @Override
    public int foodPrice() {
        return 120;
    }
}
