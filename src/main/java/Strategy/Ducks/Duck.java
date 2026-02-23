package Strategy.Ducks;

public abstract class Duck {
  final String name;
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  protected Duck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    this.name = name;
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public String display() {
    return "You're now viewing the duck with name " + name;
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
