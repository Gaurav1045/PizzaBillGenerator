
import java.util.Scanner;

public class PizzaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Pizza Ordering System");
        
        System.out.print("Enter 'veg' for Vegetarian Pizza or 'non-veg' for Non-Vegetarian Pizza: ");
        String pizzaType = sc.nextLine();
        Boolean isVeg = pizzaType.equalsIgnoreCase("veg");
        
        System.out.print("Do you want a Deluxe Pizza? (yes/no): ");
        String deluxeOption = sc.nextLine();
        
        Pizza pizza;
        if (deluxeOption.equalsIgnoreCase("yes")) {
            pizza = new DeluxePizza(isVeg);  
        } else {
            pizza = new Pizza(isVeg);
            System.out.print("Do you want to add extra cheese? (yes/no): ");
            String extraCheese = sc.nextLine();
            if (extraCheese.equalsIgnoreCase("yes")) {
                pizza.addExtraCheese();
            }

            System.out.print("Do you want to add extra toppings? (yes/no): ");
            String extraToppings = sc.nextLine();
            if (extraToppings.equalsIgnoreCase("yes")) {
                pizza.addExtraToppings();
            }
        }

        System.out.print("Do you want to opt for take away? (yes/no): ");
        String takeAway = sc.nextLine();
        if (takeAway.equalsIgnoreCase("yes")) {
            pizza.takeAway();
        }

        pizza.getBill();
        
        sc.close();
    }
}
