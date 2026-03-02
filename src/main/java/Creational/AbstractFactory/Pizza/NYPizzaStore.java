package Creational.AbstractFactory.Pizza;

public class NYPizzaStore extends PizzaStore {
  // the ingredients factory is baked into the constructor because
  // we don't want to pass any other IngredientsFactory instance
  // apart from the NYStyleIngredientsFactory
  public NYPizzaStore() {
    this.ingredientsFactory = new NYIngredientsFactory();
  }
}