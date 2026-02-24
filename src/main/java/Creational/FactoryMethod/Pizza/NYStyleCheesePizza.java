package Creational.FactoryMethod.Pizza;

public class NYStyleCheesePizza extends Pizza {
  public NYStyleCheesePizza() {
    name = "New York style cheese pizza";
    dough = "Thin crust";
    sauce = "Marinara sauce";
    toppings.add("Grated reggiano cheese");
  }
}