import java.util.Scanner;

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
                case 1 -> appetizer = DishFactory.createAppetizer("ChickenSalad");
                case 2 -> appetizer = DishFactory.createAppetizer("ButterCracker");
                case 3 -> appetizer = DishFactory.createAppetizer("CheeseTwist");
                case 4 -> appetizer = DishFactory.createAppetizer("PotatoBite");
            }
        }
        scanner.nextLine(); // Clear input buffer

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
                case 5 -> mainCourse = DishFactory.createMainCourse("Lasagna");
                case 6 -> mainCourse = DishFactory.createMainCourse("Steak");
                case 7 -> mainCourse = DishFactory.createMainCourse("Molokhiya");
                case 8 -> mainCourse = DishFactory.createMainCourse("GrilledChicken");
            }
        }
        scanner.nextLine(); // Clear input buffer

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
                case 9 -> dessert = DishFactory.createDessert("FruitSalad");
                case 10 -> dessert = DishFactory.createDessert("Tiramisu");
                case 11 -> dessert = DishFactory.createDessert("Browny");
                case 12 -> dessert = DishFactory.createDessert("IceCream");
            }
        }
        scanner.close();

        // Display the selected meals
        System.out.println("\nYour Meal:");
        if (appetizer != null) appetizer.serve();
        if (mainCourse != null) mainCourse.serve();
        if (dessert != null) dessert.serve();
    }
}
