package Strategy.Ducks;

public class SqueakyQuack implements QuackBehavior {
  public void quack() {
    System.out.println("My quack is a squeaky quack.");
  }

}