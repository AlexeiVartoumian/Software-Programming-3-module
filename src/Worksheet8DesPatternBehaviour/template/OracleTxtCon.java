package Worksheet8DesPatternBehaviour.template;

public class OracleTxtCon extends ConnectionTemplate {

  @Override
  public void setDBDriver() {
      System.out.println("Setting up Oracle DB Servers");

  }

  @Override
  public void setCredentials() {
      System.out.println("Setting up Credentials for Oracle Db");

  }

  @Override
  public void setData() {
      System.out.println("Setting up data from txt file");

  }
}
