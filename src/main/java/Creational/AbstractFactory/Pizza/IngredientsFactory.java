package Creational.AbstractFactory.Pizza;

public interface IngredientsFactory {
  Dough makeDough();
  Sauce makeSauce();
  Cheese makeCheese();
  Pepperoni makePepperoni();
  Clams makeClams();
}