package Worksheet7DesPatternBehaviour.mediator;

public class Heater {

    private MachineMediator mediator;
  public void setMediator(MachineMediator mediator) {
    this.mediator = mediator;
  }

  public void on(int i) {
      System.out.printf("setting wash to %d degrees!" , i);
        //mediator.start();
  }

  public void off() {
      System.out.println("Turning off the heater");
      //mediator.off();
  }
}
