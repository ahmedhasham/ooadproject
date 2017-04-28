package javaapplication13;

import java.util.ArrayList;
import java.util.List;


public class ISteaks{
    List<FoodItem> steaklist = new ArrayList<>();
    public ISteaks() {
        steaklist.add(new ChickenSteak());
        steaklist.add(new BeefSteak());
    }
}
