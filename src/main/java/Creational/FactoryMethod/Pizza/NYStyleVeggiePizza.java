package Creational.FactoryMethod.Pizza;

public class NYStyleVeggiePizza extends Pizza {
  public NYStyleVeggiePizza() {
    name = "New York style veggie pizza";
    dough = "Thin crust dough";
    sauce = "Garlic sauce";
    toppings.add("A bunch of veggies");
  }
}