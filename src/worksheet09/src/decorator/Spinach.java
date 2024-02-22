package decorator;

public class Spinach extends PizzaDecorator {
  private  Pizza pizza;
  public Spinach(Pizza pizza) {
    super(pizza);
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + " "  + this.getClass().getSimpleName() + "(7.92)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 7.92;
  }
}
