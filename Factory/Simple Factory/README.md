# README

## Overview

This project implements a meal selection system using the Factory Method pattern. Users can select appetizers, main courses, and desserts from a predefined menu. The system then creates the selected dishes using a factory class and displays their details.

## Structure

The project follows an object-oriented design and includes the following components:

### 1. **Interfaces**

- `IDish`: A common interface for all dish types, enforcing the `serve()` method.
- `IAppetizer`, `IMainCourse`, `IDessert`: Extending `IDish`, these interfaces categorize the dishes.

### 2. **Abstract Class**

- `Dish`: A base abstract class that implements `IDish` and contains common attributes (size, calories, price, ingredients) along with a method to display dish details.

### 3. **Factory Class**

- **`DishFactory` (`DishFactory.java`)**
  - Responsible for creating instances of different dish types based on user selection.
  - Uses a switch statement to return the appropriate dish object.

### 4. **Concrete Classes**

- **Appetizers (`Appetizers.java`)**
  - `ChickenSalad`, `ButterCracker`, `CheeseTwist`, `PotatoBite`
- **Main Courses (`MainCourse.java`)**
  - `Lasagna`, `Steak`, `Molokhiya`, `GrilledChicken`
- **Desserts (`Desserts.java`)**
  - `FruitSalad`, `Tiramisu`, `Browny`, `IceCream`

Each dish class extends `Dish` and implements its respective category interface.

### 5. **Main Application (`Main.java`)**

- Displays a menu for appetizers, main courses, and desserts.
- Accepts user input to select dishes.
- Uses `DishFactory` to instantiate the selected dishes dynamically.
- Calls the `serve()` method to display the selected dishes and their details.

## How to Run

1. Compile all Java files.
2. Run `Main.java`.
3. Follow the prompts to select dishes from the menu.
4. The program will display the details of the selected dishes.
