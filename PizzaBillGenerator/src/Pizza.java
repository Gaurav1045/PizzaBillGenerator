
public class Pizza {

	private String name;
	private Boolean veg;
	private String size;
	private int price;
	private int extraCheesePrice = 50;
	private int extraToppingsPrice = 100;
	private int backPackPrice = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;

	public Pizza(String name, Boolean veg, String size) {
		this.name = name;
		this.veg = veg;
		this.size = size;

		if (size.equalsIgnoreCase("Small")) {
			this.price = veg ? 150 : 250;
		} else if (size.equalsIgnoreCase("Medium")) {
			this.price = veg ? 250 : 400;
		} else if (size.equalsIgnoreCase("Large")) {
			this.price = veg ? 350 : 500;
		}

		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}

	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraToppingsPrice;
	}

	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += backPackPrice;
	}

	public void getBill() {
		String bill = "Pizza: " + name + "\n";
		bill += "Size: " + size + "\n";
		bill += "Base Pizza Price: " + basePizzaPrice + "\n";

		if (isExtraCheeseAdded) {
			bill += "Extra Cheese: " + extraCheesePrice + "\n";
		}

		if (isExtraToppingsAdded) {
			bill += "Extra Toppings: " + extraToppingsPrice + "\n";
		}

		if (isOptedForTakeAway) {
			bill += "Takeaway Charge: " + backPackPrice + "\n";
		}

		bill += "Total Bill: " + this.price + "\n";
		System.out.println();
		System.out.println(bill);
	}
}
