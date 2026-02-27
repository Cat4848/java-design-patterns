package Creational.AbstractFactory.Pizza;

public class CheesePizza extends Pizza {
  IngredientsFactory ingredientsFactory;
  public CheesePizza(IngredientsFactory ingredientsFactory) {
    this.ingredientsFactory = ingredientsFactory;
  }

  public void prepare() {
    dough = ingredientsFactory.makeDough();
    sauce = ingredientsFactory.makeSauce();
    cheese = ingredientsFactory.makeCheese();
    pepperoni = ingredientsFactory.makePepperoni();
    clams = ingredientsFactory.makeClams();
  }

}