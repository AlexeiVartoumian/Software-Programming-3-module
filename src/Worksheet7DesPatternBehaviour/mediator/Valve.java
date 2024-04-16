package Worksheet7DesPatternBehaviour.mediator;

public class Valve {

    private MachineMediator mediator;
  public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
  }

  public void open() {
      System.out.println(mediator.getClass().toGenericString() +  " opening the valve");
        mediator.open();
  }

  public void closed() {
      System.out.println(mediator.getClass().toGenericString() +  " closing the valve");
        mediator.closed();
  }
}
