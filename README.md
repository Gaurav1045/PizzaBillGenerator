Here's the updated `README.md` file with your GitHub username:

---

# Pizza Bill Generator 🍕

A simple **Pizza Bill Generator** built using Core Java. This application allows users to order a pizza, customize it with extra cheese and toppings, choose a takeaway option, and generate a detailed bill based on the order.

## Features
- **Pizza Selection**: Choose between Vegetarian and Non-Vegetarian pizzas.
- **Pizza Types**: Regular and Deluxe options available.
- **Customizations**: Option to add extra cheese and extra toppings.
- **Takeaway Option**: Select takeaway with an additional charge.
- **Bill Generation**: Displays a detailed breakdown of the selected items and calculates the total cost.

## Key Concepts
- **OOP Principles**: Demonstrates inheritance, method overriding, and encapsulation.
- **Modular Design**: Separate classes for basic and deluxe pizzas.
- **Dynamic Input Handling**: Allows users to select pizza by number and automatically determines veg/non-veg options.

## Class Structure
- `Pizza.java`: The base class that manages pizza attributes (e.g., price, cheese, toppings, takeaway).
- `DeluxePizza.java`: Inherits from `Pizza`, and automatically includes extra cheese and toppings.
- `PizzaMain.java`: The main class that interacts with the user to generate the bill.

## How to Use
1. Clone the repository:
    ```bash
    git clone https://github.com/Gaurav1045/pizza-bill-generator.git
    ```
2. Navigate to the project directory:
    ```bash
    cd pizza-bill-generator
    ```
3. Compile and run the `PizzaMain.java` file:
    ```bash
    javac PizzaMain.java
    java PizzaMain
    ```
4. Follow the prompts to select pizza type, add extras, and view the final bill.

## Example Output
```
Welcome to the Pizza Ordering System
1. Regular Pizza
2. Deluxe Pizza
Enter your choice (1 for Regular, 2 for Deluxe): 1
Choose a pizza from the following Veg options:
1. Margherita
2. Farmhouse
...
Enter the number of the pizza: 1
Choose the size (Small/Medium/Large): Medium
Do you want to add extra cheese? (Y/N): Y
Do you want to add extra toppings? (Y/N): N
Do you want a takeaway? (Y/N): Y

Base Pizza Price: 250
Extra Cheese Added: 50
Takeaway Charge: 20
Total Bill: 320
```

---

This will link your repository properly when users follow the instructions!
