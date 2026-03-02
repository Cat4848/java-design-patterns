package Creational.AbstractFactory.Pizza;

public interface IngredientsFactory {
  String getSource();

  Dough makeDough();

  Sauce makeSauce();

  Cheese makeCheese();

  Pepperoni makePepperoni();

  Clams makeClams();
}