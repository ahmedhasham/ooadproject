package javaapplication13;

import java.util.ArrayList;
import java.util.List;


public class IDrinks{
    List<RefreshmentItem> drinkslist = new ArrayList<>();
    public IDrinks() {
        drinkslist.add(new PepsiDrink());
        drinkslist.add(new CokeDrink());
    }
}
