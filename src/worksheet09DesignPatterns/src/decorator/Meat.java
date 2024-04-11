package worksheet09DesignPatterns.src.decorator;

public class Meat extends PizzaDecorator {
  private decorator.Pizza pizza;
  public Meat(decorator.Pizza pizza) {
    super(pizza);
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {

    return pizza.getDesc() + " "  + this.getClass().getSimpleName() + "(14.25)";
  }

  @Override
  public double getPrice() {

    return pizza.getPrice() + 14.25;
  }
}
