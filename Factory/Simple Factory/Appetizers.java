import java.util.List;

class ChickenSalad extends Dish implements IAppetizer {
    public ChickenSalad(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Chicken Salad \n======\n" + showDetails());
    }
}

class ButterCracker extends Dish implements IAppetizer {
    public ButterCracker(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Butter Cracker \n======\n" + showDetails());
    }
}

class CheeseTwist extends Dish implements IAppetizer {
    public CheeseTwist(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Cheese Twist \n======\n" + showDetails());
    }
}

class PotatoBite extends Dish implements IAppetizer {
    public PotatoBite(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Potato Bite \n======\n" + showDetails());
    }
}
