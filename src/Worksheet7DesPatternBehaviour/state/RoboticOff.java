package Worksheet7DesPatternBehaviour.state;

public class RoboticOff implements RoboticState {

    private Robot robot;
  public RoboticOff(Robot robot) {
      this.robot = robot;
  }

  @Override
  public void walk() {

      System.out.println("changing state from off to on ");
      System.out.println("robot is walking!");
      robot.setRoboticState(robot.getRoboticOn());

  }

  @Override
  public void cook() {

      if(robot.getState().getClass() == this.getClass()){
          System.out.println("Cannot cook in a switched off state");
      }
  }

  @Override
  public void off() {

      if(robot.getState().getClass() == this.getClass()){
          System.out.println("Robot already switched off");
      }
  }
}
