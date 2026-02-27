package Creational.AbstractFactory.Pizza;

public class ChicagoIngredientsFactory implements IngredientsFactory {
  public Dough makeDough() {
    return new ThickCrustDough();
  }

  public Sauce makeSauce() {
    return new PlumpTomatoSauce();
  }

  public Cheese makeCheese() {
    return new MozzarellaCheese();
  }

  public Pepperoni makePepperoni() {
    return new SlicedPepperoni();
  }

  public Clams makeClams() {
    return new FrozenClams();
  }
}