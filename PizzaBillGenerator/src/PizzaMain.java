
import java.util.Scanner;

public class PizzaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List of pizzas and their types
        String[] vegPizzas = {
            "Margherita", "Farmhouse", "Veggie Supreme", "Paneer Makhani", 
            "Peppy Paneer", "Mexican Green Wave", "Cheese n Corn", 
            "Fresh Veggie", "Double Cheese Margherita", "Veg Extravaganza"
        };
        String[] nonVegPizzas = {
            "Pepperoni", "Chicken Supreme", "Meat Lovers", "Chicken Fiesta", 
            "Barbeque Chicken", "Peri-Peri Chicken", "Chicken Dominator", 
            "Chicken Sausage", "Spicy Chicken Mexican", "Keema Do Pyaza"
        };

        System.out.println("Choose your pizza type:");
        System.out.println("1. Regular Pizza");
        System.out.println("2. Deluxe Pizza");

        System.out.print("Enter your choice (1 for Regular, 2 for Deluxe): ");
        int pizzaType = sc.nextInt();
        sc.nextLine();  

        String pizzaName;
        Boolean isVeg;
        String size;

        if (pizzaType == 1) {
            // Display veg pizzas
            System.out.println("Choose a pizza from the following Veg options:");
            for (int i = 0; i < vegPizzas.length; i++) {
                System.out.println((i + 1) + ". " + vegPizzas[i]);
            }

            System.out.println("Choose a pizza from the following Non-Veg options:");
            for (int i = 0; i < nonVegPizzas.length; i++) {
                System.out.println((i + 1 + vegPizzas.length) + ". " + nonVegPizzas[i]);
            }

            System.out.print("Enter the number of the pizza: ");
            int pizzaChoice = sc.nextInt();

            // Determine pizza name and type
            if (pizzaChoice >= 1 && pizzaChoice <= vegPizzas.length) {
                pizzaName = vegPizzas[pizzaChoice - 1];
                isVeg = true;
            } else if (pizzaChoice >= 1 + vegPizzas.length && pizzaChoice <= vegPizzas.length + nonVegPizzas.length) {
                pizzaName = nonVegPizzas[pizzaChoice - 1 - vegPizzas.length];
                isVeg = false;
            } else {
                System.out.println("Invalid choice!");
                sc.close();
                return; 
            }

            System.out.print("Choose the size (Small/Medium/Large): ");
            size = sc.next(); 

            Pizza pizza = new Pizza(pizzaName, isVeg, size);

            System.out.print("Do you want to add extra cheese? (Y/N): ");
            if (sc.next().charAt(0) == 'Y') {
                pizza.addExtraCheese();
            }

            System.out.print("Do you want to add extra toppings? (Y/N): ");
            if (sc.next().charAt(0) == 'Y') {
                pizza.addExtraToppings();
            }

            System.out.print("Do you want a takeaway? (Y/N): ");
            if (sc.next().charAt(0) == 'Y') {
                pizza.takeAway();
            }

            pizza.getBill();

        } else if (pizzaType == 2) {

            System.out.print("Choose the size (Small/Medium/Large): ");
            size = sc.next(); 


            DeluxePizza deluxePizza = new DeluxePizza("Deluxe", true, size); // Assuming Deluxe Pizza is always Veg

            System.out.print("Do you want a takeaway? (Y/N): ");
            if (sc.next().charAt(0) == 'Y') {
                deluxePizza.takeAway();
            }
            
            deluxePizza.getBill();

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
