package javaapplication13;

import java.util.ArrayList;
import java.util.List;


public class IBurger {
    List<FoodItem> burgerlist = new ArrayList<>();

    public IBurger() {
        burgerlist.add(new ChickenBurger());
        burgerlist.add(new BeefBurger());
        burgerlist.add(new GrilledBurger());

    }
}
