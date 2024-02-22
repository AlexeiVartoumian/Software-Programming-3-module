package decorator;

public class SimplyVegPizza implements Pizza {
  private String desc;
  private double price;
  public SimplyVegPizza(){
    this.price = 230;
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
