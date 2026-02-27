package Creational.AbstractFactory.Pizza;

public class VeggiePizza extends Pizza {
  public VeggiePizza(IngredientsFactory ingredientsFactory) {
    this.ingredientsFactory = ingredientsFactory;
  }

  public void prepare() {
    dough = ingredientsFactory.makeDough();
    sauce = ingredientsFactory.makeSauce();
    cheese = ingredientsFactory.makeCheese();
  }
}