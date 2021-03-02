import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    public LocalTime openingTime;
    public LocalTime closingTime;
    List<Item> menu = new ArrayList<Item>(); //List of items

    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public String getName() {
        return name;
    }

    public boolean isRestaurantOpen() {//Implemented
        if (getCurrentTime().isAfter(openingTime) && getCurrentTime().isBefore(closingTime)) {
            return true;
        } else {
            return false;
        }
    }

    public LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    public void addToMenu(String name, int price) { //first adding items to the list
        Item newItem = new Item(name, price);
        menu.add(newItem);
    }

    public List<Item> getMenu() {//to get the list of items //implemented
        return menu;
    }

    private Item findItemByName(String itemName) throws itemNotFoundException {
        for (Item item : menu) {
            if (item.getName().equals(itemName))
                return item;
        }
        throw new itemNotFoundException(itemName);
    }

    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }

    public void displayDetails() {
        System.out.println("Restaurant:" + name + "\n"
                + "Location:" + location + "\n"
                + "Opening time:" + openingTime + "\n"
                + "Closing time:" + closingTime + "\n"
                + "Menu:" + "\n" + getMenu());
    }


}
