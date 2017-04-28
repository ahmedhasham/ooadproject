package javaapplication13;


public class PepsiDrink implements RefreshmentItem {
    @Override
    public String refreshmentName() {
        return "Coke";
    }

    @Override
    public int refreshmentPrice() {
        return 35;
    }
}
