package Creational.FactoryMethod.Pizza;

import Main.Showcase;

public class PizzaFactoryMethodShowcase implements Showcase {
  public void show() {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    Pizza nyStyleCheesePizza = nyPizzaStore.orderPizza("cheese");
    Pizza nyStyleVeggiePizza = nyPizzaStore.orderPizza("veggie");

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    Pizza chicagoStyleCheesePizza = chicagoPizzaStore.orderPizza("cheese");
    Pizza chicagoStyleVeggiePizza = chicagoPizzaStore.orderPizza("veggie");
  }
}