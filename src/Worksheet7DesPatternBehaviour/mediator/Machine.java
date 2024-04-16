package Worksheet7DesPatternBehaviour.mediator;

public class Machine {

    private MachineMediator mediator;

  public void setMediator(MachineMediator mediator) {

      this.mediator = mediator;
  }

  public void start() {
      System.out.println("Firing up the Washing machine");
      mediator.wash();
  }
}
