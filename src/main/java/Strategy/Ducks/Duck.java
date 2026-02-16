package Strategy.Ducks;

public abstract class Duck {
  public void display() {
    System.out.println("Display duck");
  }

  public abstract void performFly();
  public abstract void performQuack();
}
