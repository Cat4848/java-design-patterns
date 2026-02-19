package Strategy.Ducks;

public class MallardDuck extends Duck {
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  public MallardDuck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    super(name);
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}