import java.util.Arrays;

public class DishFactory {
    public static IAppetizer createAppetizer(String dishType) {
        return switch (dishType) {
            case "ChickenSalad" -> new ChickenSalad("Small", "350-450", 8.99, Arrays.asList("Chicken", "Lettuce", "Tomatoes", "Cucumbers", "Salad dressing"));
            case "ButterCracker" -> new ButterCracker("Small", "70-80", 9.99, Arrays.asList("Flour", "Butter", "Salt"));
            case "CheeseTwist" -> new CheeseTwist("Small", "100-150", 7.99, Arrays.asList("Puff pastry", "Cheese", "Egg", "Salt"));
            case "PotatoBite" -> new PotatoBite("Small", "200-250", 5.99, Arrays.asList("Potato", "Cheese", "Breadcrumbs", "Egg"));
            default -> throw new IllegalArgumentException("Invalid Appetizer");
        };
    }

    public static IMainCourse createMainCourse(String dishType) {
        return switch (dishType) {
            case "Lasagna" -> new Lasagna("Large", "300-600", 14.99, Arrays.asList("Pasta", "Cheese", "Tomato", "Beef"));
            case "Steak" -> new Steak("Medium", "500-700", 17.99, Arrays.asList("Beef steak", "Salt", "Pepper"));
            case "Molokhiya" -> new Molokhiya("Medium", "100-200", 16.99, Arrays.asList("Molokhiya leaves", "Chicken broth", "Garlic", "Coriander"));
            case "GrilledChicken" -> new GrilledChicken("Large", "200-300", 15.99, Arrays.asList("Chicken", "Salt", "Pepper", "Paprika"));
            default -> throw new IllegalArgumentException("Invalid Main Course");
        };
    }

    public static IDessert createDessert(String dishType) {
        return switch (dishType) {
            case "FruitSalad" -> new FruitSalad("Medium", "100-150", 7.99, Arrays.asList("Apple", "Banana", "Orange", "Berries"));
            case "Tiramisu" -> new Tiramisu("Small", "400-600", 8.99, Arrays.asList("Ladyfingers", "Coffee", "Egg yolks", "Mascarpone cheese", "Cocoa powder"));
            case "Browny" -> new Browny("Medium", "150-250", 7.99, Arrays.asList("Sugar", "Butter", "Cocoa powder", "Eggs", "Flour", "Vanilla extract"));
            case "IceCream" -> new IceCream("Small", "200-250", 6.99, Arrays.asList("Milk", "Sugar", "Cream", "Egg yolks", "Vanilla extract"));
            default -> throw new IllegalArgumentException("Invalid Dessert");
        };
    }
}
