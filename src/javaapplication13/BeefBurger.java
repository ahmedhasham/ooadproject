package javaapplication13;


public class BeefBurger implements FoodItem {
    @Override
    public String foodName() {
        return "Beef Burger";
    }

    @Override
    public int foodPrice() {
        return 200;
    }
}
