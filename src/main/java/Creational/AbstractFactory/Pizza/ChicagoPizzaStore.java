package Creational.AbstractFactory.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
  final IngredientsFactory ingredientsFactory = new ChicagoIngredientsFactory();
}
