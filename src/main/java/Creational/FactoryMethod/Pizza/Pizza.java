package Creational.FactoryMethod.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  List<String> toppings = new ArrayList<String>();

  public void prepare() {
    System.out.println("We are preparing your " + name + " pizza");
    System.out.println("Tossing dough");
    System.out.println("Adding sauce " + sauce);
    System.out.println("Adding toppings");
    for (String t : toppings) {
      System.out.println("Topping: " + t);
    }
  }

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