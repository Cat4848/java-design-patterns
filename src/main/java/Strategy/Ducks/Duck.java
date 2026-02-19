package Strategy.Ducks;

public abstract class Duck {
  final String name;
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  protected Duck(String name) {
    this.name = name;
  }

  public String display() {
    return "You're now viewing the duck with name " + name;
  }

  public abstract void performFly();
  public abstract void performQuack();
  public abstract void setFlyBehavior(FlyBehavior flyBehavior);
  public abstract void setQuackBehavior(QuackBehavior quackBehavior);
}
