import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TestingRestaurantMethods {
    public static void main(String ar[]) throws restaurantNotFoundException {

       LocalTime openingTime = LocalTime.parse("10:30:00");
       LocalTime closingTime = LocalTime.parse("22:00:00");

        RestaurantService restaurantService = new RestaurantService();
        restaurantService.addRestaurant("Amelie's cafe","Chennai", openingTime,closingTime);
        restaurantService.addRestaurant("World's cafe","Pune", openingTime,closingTime);
        restaurantService.addRestaurant("Aroma cafe","Mumbai", openingTime,closingTime);

        System.out.println("Check if the restaurant is available in the list -- "
                +restaurantService.findRestaurantByName("Aroma cafe").getName());
    }

}
/*
        Restaurant restaurant1 = new Restaurant("Amelie's cafe",
                "Chennai", openingTime,closingTime);

        System.out.println(restaurant1.isRestaurantOpen());

        Item item1 = new Item("Sweet corn soup", 119);
        Item item2 = new Item("Vegetable lasagne", 269);

        List<Item> itemList = new ArrayList<>();
        itemList.add(0,item1);
        itemList.add(1,item2);

        System.out.println("List of menu items"+ itemList);*/

