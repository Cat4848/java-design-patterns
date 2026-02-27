package Creational.AbstractFactory.Pizza;

public class NYIngredientsFactory implements IngredientsFactory {
  public Dough makeDough() {
    return new ThinCrustDough();
  }

  public Sauce makeSauce() {
    return new MarinaraSauce();
  }

  public Cheese makeCheese() {
    return new ReggianoCheese();
  }

  public Pepperoni makePepperoni() {
    return new SlicedPepperoni();
  }

  public Clams makeClams() {
    return new FreshClams();
  }
}