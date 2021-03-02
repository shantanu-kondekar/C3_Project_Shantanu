import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
     List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {
        for (Restaurant findRestaurant : restaurants) {
            if (findRestaurant.getName().equals(restaurantName))
                return findRestaurant;
        }
        throw new restaurantNotFoundException(restaurantName);

    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }


}
