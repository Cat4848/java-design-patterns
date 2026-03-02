package Creational.AbstractFactory.Pizza;

public class NYIngredientsFactory implements IngredientsFactory {
  final String source = "New York";

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

  public String getSource() {
    return source;
  }
}