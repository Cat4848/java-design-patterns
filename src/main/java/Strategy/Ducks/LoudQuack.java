package Strategy.Ducks;

public class LoudQuack implements QuackBehavior {
  public void quack() {
    System.out.println("I can quack loud and clear.");
  }
}