package Main;

import Strategy.Ducks.DucksShowcase;
import Creational.FactoryMethod.Pizza.PizzaFactoryMethodShowcase;

public class Main {
  public static void main(String[] args) {
//    Showcase ducksShowcase = new DucksShowcase();
//    ducksShowcase.show();
    Showcase pizzaFactoryMethodShowcase = new PizzaFactoryMethodShowcase();
    pizzaFactoryMethodShowcase.show();
  }
}
