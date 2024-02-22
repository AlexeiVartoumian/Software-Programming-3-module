package decorator;

public class Cheese extends PizzaDecorator {
  private  Pizza pizza;
  public Cheese(Pizza pizza) {
    super(pizza);
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {

    return pizza.getDesc() + " "  + this.getClass().getSimpleName() + "(20.72)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 20.72;
  }
}
