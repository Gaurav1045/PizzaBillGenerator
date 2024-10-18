
public class DeluxePizza extends Pizza {

    public DeluxePizza(String name, Boolean veg, String size) {
        super(name, veg, size);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        System.out.println("Extra cheese is already included in the Deluxe Pizza.");
    }

    @Override
    public void addExtraToppings() {
        System.out.println("Extra toppings are already included in the Deluxe Pizza.");
    }
}
