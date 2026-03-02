package Creational.AbstractFactory.Pizza;

import Main.Showcase;

public class AbstractFactoryShowcase implements Showcase {
  public void show() {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    Pizza pizza = nyPizzaStore.orderPizza("cheese");
    System.out.println("We hope that you'll enjoy your " + pizza.name);
  }
}