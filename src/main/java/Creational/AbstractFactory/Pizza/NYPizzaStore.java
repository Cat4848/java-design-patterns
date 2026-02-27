package Creational.AbstractFactory.Pizza;

public class NYPizzaStore extends PizzaStore {
  final IngredientsFactory ingredientsFactory = new NYIngredientsFactory();
}