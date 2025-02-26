import java.util.List;

public abstract class Dish implements IDish {
    private String size;
    private String calories;
    private double price;
    private List<String> ingredients;

    public Dish(String size, String calories, double price, List<String> ingredients) {
        this.size = size;
        this.calories = calories;
        this.price = price;
        this.ingredients = ingredients;
    }

    protected String showDetails() {
        return "  | Size: " + size + " (" + calories + ") cal. ($" + price + ")\n"
                + "  | Ingredients: " + String.join(", ", ingredients) + "\n";
    }
}
