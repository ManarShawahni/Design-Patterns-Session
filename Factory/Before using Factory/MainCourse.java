import java.util.List;

class Lasagna extends Dish implements IMainCourse {
    public Lasagna(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Lasagna \n======\n" + showDetails());
    }
}

class Steak extends Dish implements IMainCourse {
    public Steak(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Steak \n======\n" + showDetails());
    }
}

class Molokhiya extends Dish implements IMainCourse {
    public Molokhiya(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Molokhiya \n======\n" + showDetails());
    }
}

class GrilledChicken extends Dish implements IMainCourse {
    public GrilledChicken(String size, String calories, double price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Grilled Chicken \n======\n" + showDetails());
    }
}
