package Worksheet8DesPatternBehaviour.mediator;

public class Motor {
  public void startMotor() {
      System.out.println("Starting up the motor!");
  }

  public void rotateDrum(int i) {
      System.out.printf("Washing Drum rotating at %d rpm!", i);
  }
}
