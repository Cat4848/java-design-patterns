package Creational.FactoryMethod.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
  public ChicagoStyleVeggiePizza() {
    name = "Chicago style veggie pizza";
    dough = "Thick crust";
    sauce = "Brown sauce";
    toppings.add("A bunch of veggies");
  }
}