package javaapplication13;


public class CokeDrink implements RefreshmentItem {
    @Override
    public String refreshmentName() {
        return "Pepsi";
    }

    @Override
    public int refreshmentPrice() {
        return 35;
    }
}
