package Creational.AbstractFactory.Pizza;

public abstract class PizzaStore {
  IngredientsFactory ingredientsFactory;

  private Pizza orderPizza(String type) {
    Pizza pizza = makePizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  private Pizza makePizza(String type) {
    if (type.equals("cheese")) {
      return new CheesePizza(ingredientsFactory);
    } else {
      return new VeggiePizza(ingredientsFactory);
    }
  }
}