package Creational.FactoryMethod.Pizza;

public class NYPizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
    Pizza pizza;
    if (type.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    } else {
      pizza = new NYStyleVeggiePizza();
    }
    return pizza;
  }
}