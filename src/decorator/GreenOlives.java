package decorator;

public class GreenOlives extends PizzaDecorator {

  private  Pizza pizza;
  public GreenOlives(Pizza pizza) {
    super(pizza);
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + " "  + this.getClass().getSimpleName() + "(5.47)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 5.47;
  }
}
