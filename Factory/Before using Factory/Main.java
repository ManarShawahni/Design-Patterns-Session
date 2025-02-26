import java.util.*;

public class Main {
    public static void main(String[] args) {
        IAppetizer appetizer = null;
        IMainCourse mainCourse = null;
        IDessert dessert = null;

        Scanner scanner = new Scanner(System.in);
        int choice;

        // Appetizers Menu
        System.out.println("Appetizers:");
        System.out.println("1. Chicken Salad");
        System.out.println("2. Butter Cracker");
        System.out.println("3. Cheese Twist");
        System.out.println("4. Potato Bite");
        System.out.println("Press any other key to skip");
        System.out.print("Enter choice: ");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> appetizer = new ChickenSalad("Small", "350-450", 8.99, Arrays.asList("Chicken", "Lettuce", "Tomatoes", "Cucumbers", "Salad dressing"));
                case 2 -> appetizer = new ButterCracker("Small", "70-80", 9.99, Arrays.asList("Flour", "Butter", "Salt"));
                case 3 -> appetizer = new CheeseTwist("Small", "100-150", 7.99, Arrays.asList("Puff pastry", "Cheese", "Egg", "Salt"));
                case 4 -> appetizer = new PotatoBite("Small", "200-250", 5.99, Arrays.asList("Potato", "Cheese", "Breadcrumbs", "Egg"));
            }
        }
        scanner.nextLine(); // Clear buffer

        // Main Course Menu
        System.out.println("\nMain Course:");
        System.out.println("5. Lasagna");
        System.out.println("6. Steak");
        System.out.println("7. Molokhiya");
        System.out.println("8. Grilled Chicken");
        System.out.println("Press any other key to skip");
        System.out.print("Enter choice: ");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            switch (choice) {
                case 5 -> mainCourse = new Lasagna("Large", "300-600", 14.99, Arrays.asList("Pasta", "Cheese", "Tomato", "Beef"));
                case 6 -> mainCourse = new Steak("Medium", "500-700", 17.99, Arrays.asList("Beef steak", "Salt", "Pepper"));
                case 7 -> mainCourse = new Molokhiya("Medium", "100-200", 16.99, Arrays.asList("Molokhiya leaves", "Chicken broth", "Garlic", "Coriander"));
                case 8 -> mainCourse = new GrilledChicken("Large", "200-300", 15.99, Arrays.asList("Chicken", "Salt", "Pepper", "Paprika"));
            }
        }
        scanner.nextLine(); // Clear buffer

        // Desserts Menu
        System.out.println("\nDesserts:");
        System.out.println("9. Fruit Salad");
        System.out.println("10. Tiramisu");
        System.out.println("11. Brownie");
        System.out.println("12. Ice Cream");
        System.out.println("Press any other key to skip");
        System.out.print("Enter choice: ");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            switch (choice) {
                case 9 -> dessert = new FruitSalad("Medium", "100-150", 7.99, Arrays.asList("Apple", "Banana", "Orange", "Berries"));
                case 10 -> dessert = new Tiramisu("Small", "400-600", 8.99, Arrays.asList("Ladyfingers", "Coffee", "Egg yolks", "Mascarpone cheese", "Cocoa powder"));
                case 11 -> dessert = new Browny("Medium", "150-250", 7.99, Arrays.asList("Sugar", "Butter", "Cocoa powder", "Eggs", "Flour", "Vanilla extract"));
                case 12 -> dessert = new IceCream("Small", "200-250", 6.99, Arrays.asList("Milk", "Sugar", "Cream", "Egg yolks", "Vanilla extract"));
            }
        }
        scanner.close(); // Close scanner after use

        // Display the selected meals
        System.out.println("\nYour Meal:");
        if (appetizer != null) appetizer.serve();
        if (mainCourse != null) mainCourse.serve();
        if (dessert != null) dessert.serve();
    }
}
