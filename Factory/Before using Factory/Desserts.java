import java.util.List;

class FruitSalad extends Dish implements IDessert {
    public FruitSalad(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Fruit Salad \n======\n" + showDetails());
    }
}

class Tiramisu extends Dish implements IDessert {
    public Tiramisu(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Tiramisu \n======\n" + showDetails());
    }
}

class Browny extends Dish implements IDessert {
    public Browny(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Browny \n======\n" + showDetails());
    }
}

class IceCream extends Dish implements IDessert {
    public IceCream(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Ice Cream \n======\n" + showDetails());
    }
}
