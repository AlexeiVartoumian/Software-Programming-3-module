package adapter;

public class XpayToPayDAdapter implements PayD {
  private Xpay xpay;

  public XpayToPayDAdapter(Xpay xpay) {
    this.xpay = xpay;
  }

  @Override
  public String getCustCardNo() {

    return xpay.getCreditCardNo();
  }

  @Override
  public String getCardOwnerName() {
    return xpay.getCustomerName();
  }

  @Override
  public String getCardExpMonthDate() {
    return xpay.getCardExpMonth();
  }

  @Override
  public Integer getCVVNo() {
     int converted = (int) xpay.getCardCVVNo();
     return converted;
  }

  @Override
  public Double getTotalAmount() {

    return xpay.getAmount();
  }

  @Override
  public void setCustCardNo(String custCardNo) {
    xpay.setCreditCardNo(custCardNo);
  }

  @Override
  public void setCardOwnerName(String cardOwnerName) {
    xpay.setCustomerName(cardOwnerName);
  }

  @Override
  public void setCardExpMonthDate(String cardExpMonthDate) {
    xpay.setCardExpMonth(cardExpMonthDate);
  }

  @Override
  public void setCVVNo(Integer cVVNo) {

    short res =  cVVNo.shortValue();
    xpay.setCardCVVNo(res);
  }

  @Override
  public void setTotalAmount(Double totalAmount) {
    xpay.setAmount(totalAmount);
  }
}
