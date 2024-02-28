package decorator;

public class Ham extends PizzaDecorator {
  private  Pizza pizza;
  public Ham(Pizza pizza) {
    super(pizza);
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + " "  + this.getClass().getSimpleName() + "(18.12)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 18.12;
  }
}
