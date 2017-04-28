package javaapplication13;

import java.util.ArrayList;
import java.util.List;


public class IChinese{
    List<FoodItem> chineselist = new ArrayList<>();
    public IChinese() {
        chineselist.add(new ChickenManchurein());
        chineselist.add(new ChickenChowmein());
    }
}
