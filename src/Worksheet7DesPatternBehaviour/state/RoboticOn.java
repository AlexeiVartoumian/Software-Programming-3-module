package Worksheet7DesPatternBehaviour.state;

public class RoboticOn implements RoboticState {

    private Robot robot;
  public RoboticOn(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void walk() {

      if (robot.getState().getClass() == this.getClass()) {
          System.out.println("RObot Walking!");
      }
      }

  @Override
  public void cook() {
      System.out.println("robot is cooking ");
      System.out.println("changing state");
      System.out.println("------------------");
          robot.setRoboticState(robot.getRoboticCook());
  }

  @Override
  public void off() {

        System.out.println("Turning off Robot!");
        robot.setRoboticState(robot.getRoboticOff());

  }
}
