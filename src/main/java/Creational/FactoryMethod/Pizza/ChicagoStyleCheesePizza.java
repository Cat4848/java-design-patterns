package Creational.FactoryMethod.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    name = "Chicago style cheese pizza";
    dough = "Thick crust";
    sauce = "Plum tomato sauce";
    toppings.add("Shredded mozzarella cheese");
  }
}