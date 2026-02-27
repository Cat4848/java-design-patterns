package Creational.AbstractFactory.Pizza;

public abstract class Pizza {
  Dough dough;
  Sauce sauce;
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clams;
  String name;
  IngredientsFactory ingredientsFactory;

  abstract void prepare();

  public void bake() {
    System.out.println("Bake at 200 degrees for 35 minutes");
  }

  public void cut() {
    System.out.println("Cutting in triangular slices");
  }

  public void box() {
    System.out.println("We are boxing your " + name + " pizza");
  }
}