package javaapplication13;


public class GrilledBurger implements FoodItem {
    @Override
    public String foodName() {
        return "Grilled Burger";
    }

    @Override
    public int foodPrice() {
        return 300;
    }
}
