package decorator;

public class SimplyNonVegPizza implements Pizza {
  private String desc;
  private double price;

  public SimplyNonVegPizza(){
    this.price = 350;
    this.desc = this.getClass().getSimpleName() + "("+ this.price +")";
  }
  @Override
  public String getDesc() {
    return this.desc;
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
