package decorator;

public class RomaTomatoes extends PizzaDecorator{
  private  Pizza pizza;
  public RomaTomatoes(Pizza pizza) {
    super(pizza);
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + " "  + this.getClass().getSimpleName() + "(5.20)";
  }

  @Override
  public double getPrice() {

    return pizza.getPrice() + 5.20;
  }
}
