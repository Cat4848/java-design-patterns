package Strategy.Ducks;

public class DecoyDuck extends Duck {
  public DecoyDuck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    super(name, flyBehavior, quackBehavior);
  }
}