package Main;

import Strategy.Ducks.*;

public class Main {
  public static void main(String[] args) {
    FlyBehavior flyWithWings = new FlyWithWings();
    QuackBehavior  loudQuack = new LoudQuack();
    Duck mallardDuck = new MallardDuck("Daisy", flyWithWings, loudQuack);
    System.out.println(mallardDuck.display());
    System.out.println("Let's watch it fly...");
    mallardDuck.performFly();
    System.out.println("Now let's hear it quack...");
    mallardDuck.performQuack();

    FlyBehavior flyNoWay = new FlyNoWay();
    mallardDuck.setFlyBehavior(flyNoWay);
    System.out.println("Now that we changed its fly behavior, let's see it fly again...");
    mallardDuck.performFly();
  }
}
