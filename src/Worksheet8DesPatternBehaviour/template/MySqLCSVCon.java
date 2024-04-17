package Worksheet8DesPatternBehaviour.template;

public class MySqLCSVCon extends ConnectionTemplate {

  @Override
  public void setDBDriver() {
      System.out.println("Setting up MySQL drivers");
  }

  @Override
  public void setCredentials() {
      System.out.println("Setting up connection");
  }

  @Override
  public void setData() {
      System.out.println("Setting up data from csv file");

  }
}