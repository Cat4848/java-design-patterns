package Creational.FactoryMethod.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza;
    if (type.equals("cheese")) {
      pizza = new ChicagoStyleCheesePizza();
    } else {
      pizza = new ChicagoStyleVeggiePizza();
    }
    return pizza;
  }
}