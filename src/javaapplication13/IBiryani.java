package javaapplication13;

import java.util.ArrayList;
import java.util.List;


public class IBiryani{
    List<FoodItem> biryanilist = new ArrayList<>();
    public IBiryani(){
        biryanilist.add(new ChickenBiryani());
        biryanilist.add(new BeefBiryani());
        biryanilist.add(new FishBiryani());
    }
}
